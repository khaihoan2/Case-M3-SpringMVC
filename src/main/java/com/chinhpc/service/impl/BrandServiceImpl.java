package com.chinhpc.service.impl;

import com.chinhpc.repository.BrandRepository;
import com.chinhpc.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;


}
