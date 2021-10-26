package com.chinhpc.repository;

import com.chinhpc.model.entity.City;
import com.chinhpc.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends PagingAndSortingRepository<User, Long> {
    Page<User> findAll(Pageable pageable);

    @Procedure()
    Page<User> findAllByNameContaining(String keyword, Pageable pageable);

    Page<User> findAllByEmailContaining(String keyword, Pageable pageable);

    Page<User> findAllByPhoneContaining(String keyword, Pageable pageable);

    Page<User> findAllByCity(City city, Pageable pageable);
}
