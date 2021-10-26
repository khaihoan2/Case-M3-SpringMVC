package com.chinhpc.repository;

import com.chinhpc.model.entity.Brand;
import com.chinhpc.model.entity.Category;
import com.chinhpc.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
    Page<Product> findAll(Pageable pageable);

    Page<Product> findAllByNameContaining(String keyword, Pageable pageable);

    Page<Product> findAllByBrand(Brand brand, Pageable pageable);

    Page<Product> findAllByCategory(Category category, Pageable pageable);

    Page<Product> findAllByPriceBetween(double min, double max, Pageable pageable);
}
