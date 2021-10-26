package com.chinhpc.service;

import com.chinhpc.model.entity.Brand;
import com.chinhpc.model.entity.Category;
import com.chinhpc.model.entity.Product;
import com.chinhpc.repository.IProductRepository;
import com.chinhpc.service.iservice.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> findAllByNameContaining(String keyword, Pageable pageable) {
        return productRepository.findAllByNameContaining(keyword, pageable);
    }

    @Override
    public Page<Product> findAllByBrand(Brand brand, Pageable pageable) {
        return productRepository.findAllByBrand(brand, pageable);
    }

    @Override
    public Page<Product> findAllByCategory(Category category, Pageable pageable) {
        return productRepository.findAllByCategory(category, pageable);
    }

    @Override
    public Page<Product> findAllByPriceBetween(double min, double max, Pageable pageable) {
        return productRepository.findAllByPriceBetween(min, max, pageable);
    }
}
