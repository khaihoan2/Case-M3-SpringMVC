package com.chinhpc.repository;

import com.chinhpc.model.Shipment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends PagingAndSortingRepository<Shipment, Long> {
}
