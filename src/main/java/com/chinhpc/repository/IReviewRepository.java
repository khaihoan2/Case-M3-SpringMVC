package com.chinhpc.repository;

import com.chinhpc.model.Review;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReviewRepository extends PagingAndSortingRepository<Review, Long> {
}
