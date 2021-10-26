package com.chinhpc.repository;

import com.chinhpc.model.entity.Image;
import com.chinhpc.model.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IImageRepository extends PagingAndSortingRepository<Image, Long> {
    Iterable<Image> findAllByProduct(Product product);
}
