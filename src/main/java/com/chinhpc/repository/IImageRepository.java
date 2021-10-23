package com.chinhpc.repository;

import com.chinhpc.model.Image;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImageRepository extends PagingAndSortingRepository<Image, Long> {
}
