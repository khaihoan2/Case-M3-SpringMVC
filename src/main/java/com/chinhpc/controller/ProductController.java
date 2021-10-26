package com.chinhpc.controller;

import com.chinhpc.model.dto.ProductForm;
import com.chinhpc.model.entity.Colour;
import com.chinhpc.model.entity.Image;
import com.chinhpc.model.entity.Product;
import com.chinhpc.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/admin-portal/api/products")
public class ProductController {

    @Value("${file-upload}")
    private String fileUpload;

    @Autowired
    private ProductService productService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ColourService colourService;

    @Autowired
    private ImageService imageService;


    @GetMapping
    public ResponseEntity<Page<Product>> findAll(Pageable pageable) {
        Page<Product> productPage = productService.findAll(pageable);
        if (productPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productPage, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product product = productService.findById(id).orElse(null);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody ProductForm productForm,
                                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Product product = new Product();
        product.setId(productForm.getId());
        product.setName(productForm.getName());
        product.setSKU(productForm.getSKU());
        product.setBrand(brandService.findById(productForm.getBrandId()).orElse(null));
        product.setCategory(categoryService.findById(productForm.getCategoryId()).orElse(null));
        product.setPrice(productForm.getPrice());
        product.setDescription(productForm.getDescription());
        product.setAvailability(productForm.getAvailability());
        Set<Long> colourIds = productForm.getColourIds();
        Set<Colour> colours = new HashSet<>();
        for (Long id : colourIds) {
            colours.add(colourService.findById(id).orElse(null));
        }
        product.setColours(colours);

        Set<MultipartFile> multipartFiles = productForm.getFiles();
        for (MultipartFile multipartFile : multipartFiles) {
            String fileName = multipartFile.getOriginalFilename();
            try {
                FileCopyUtils.copy(multipartFile.getBytes(), new File(fileUpload + fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image image = new Image(fileName);
            image.setProduct(product);
            imageService.save(image);
        }
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id,
                                                 @RequestBody ProductForm productForm,
                                                 BindingResult bindingResult) {
//        Optional<Product> oldProduct = productService.findById(id);
//        if (!oldProduct.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        if (bindingResult.hasErrors()) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        Product product = new Product();
//        product.setId(productForm.getId());
//        product.setName(productForm.getName());
//        product.setSKU(productForm.getSKU());
//        product.setBrand(brandService.findById(productForm.getBrandId()).orElse(null));
//        product.setCategory(categoryService.findById(productForm.getCategoryId()).orElse(null));
//        product.setPrice(productForm.getPrice());
//        product.setDescription(productForm.getDescription());
//        product.setAvailability(productForm.getAvailability());
//        Set<Long> colourIds = productForm.getColourIds();
//        Set<Colour> colours = new HashSet<>();
//        for (Long colourId : colourIds) {
//            colours.add(colourService.findById(colourId).orElse(null));
//        }
//        product.setColours(colours);
//
//        Set<MultipartFile> multipartFiles = productForm.getFiles();
//        for (MultipartFile multipartFile : multipartFiles) {
//            String fileName = multipartFile.getOriginalFilename();
//            try {
//                FileCopyUtils.copy(multipartFile.getBytes(), new File(fileUpload + fileName));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            Image image = new Image(fileName);
//            image.setProduct(product);
//            imageService.save(image);
//        }
//        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
        deleteProduct(id);
        saveProduct(productForm, bindingResult);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id) {
        Product product = productService.findById(id).orElse(null);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Iterable<Image> images = imageService.findAllByProduct(product);
        for (Image image : images) {
            imageService.deleteById(image.getId());
            new File(fileUpload + image.getName()).delete();
        }
        return new ResponseEntity<>(product, HttpStatus.NO_CONTENT);
    }
}
