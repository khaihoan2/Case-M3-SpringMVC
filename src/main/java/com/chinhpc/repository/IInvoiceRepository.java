package com.chinhpc.repository;

import com.chinhpc.model.entity.Invoice;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvoiceRepository extends PagingAndSortingRepository<Invoice, Long> {
}
