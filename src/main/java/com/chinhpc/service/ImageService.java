package com.chinhpc.service;

import com.chinhpc.model.entity.Image;
import com.chinhpc.model.entity.Product;
import com.chinhpc.repository.IImageRepository;
import com.chinhpc.service.iservice.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageService implements IImageService {

    @Autowired
    private IImageRepository imageRepository;

    @Override
    public Iterable<Image> findAll() {
        return imageRepository.findAll();
    }

    @Override
    public Optional<Image> findById(Long id) {
        return imageRepository.findById(id);
    }

    @Override
    public Image save(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public void deleteById(Long id) {
        imageRepository.deleteById(id);
    }

    @Override
    public Iterable<Image> findAllByProduct(Product product) {
        return imageRepository.findAllByProduct(product);
    }
}
