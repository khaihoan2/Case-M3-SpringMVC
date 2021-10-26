package com.chinhpc.service;

import com.chinhpc.model.entity.City;
import com.chinhpc.model.entity.User;
import com.chinhpc.service.iservice.IUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<User> findAllByCity(City city, Pageable pageable) {
        return null;
    }
}
