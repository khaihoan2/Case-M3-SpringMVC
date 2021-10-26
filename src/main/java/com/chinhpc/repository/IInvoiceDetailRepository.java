package com.chinhpc.repository;

import com.chinhpc.model.entity.InvoiceDetail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvoiceDetailRepository extends PagingAndSortingRepository<InvoiceDetail, Long> {
}
