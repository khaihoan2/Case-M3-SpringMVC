package com.chinhpc.repository;

import com.chinhpc.model.OrderDetail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderDetail extends PagingAndSortingRepository<OrderDetail, Long> {
}
