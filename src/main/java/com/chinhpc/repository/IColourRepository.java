package com.chinhpc.repository;

import com.chinhpc.model.entity.Colour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IColourRepository extends CrudRepository<Colour, Long> {
}
