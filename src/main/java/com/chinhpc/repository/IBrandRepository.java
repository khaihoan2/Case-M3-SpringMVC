package com.chinhpc.repository;

import com.chinhpc.model.entity.Brand;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBrandRepository extends PagingAndSortingRepository<Brand, Long> {
}
