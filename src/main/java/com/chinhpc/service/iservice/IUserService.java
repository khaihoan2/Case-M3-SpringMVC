package com.chinhpc.service.iservice;

import com.chinhpc.model.entity.City;
import com.chinhpc.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService extends IGeneralService<User> {
    Page<User> findAll(Pageable pageable);

    Page<User> findAllByCity(City city, Pageable pageable);
}
