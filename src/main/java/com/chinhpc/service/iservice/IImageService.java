package com.chinhpc.service.iservice;

import com.chinhpc.model.entity.Image;
import com.chinhpc.model.entity.Product;

public interface IImageService extends IGeneralService<Image> {
    Iterable<Image> findAllByProduct(Product product);
}
