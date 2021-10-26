package com.chinhpc.service;

import com.chinhpc.model.entity.Colour;
import com.chinhpc.repository.IColourRepository;
import com.chinhpc.service.iservice.IColourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ColourService implements IColourService {

    @Autowired
    private IColourRepository colourRepository;

    @Override
    public Iterable<Colour> findAll() {
        return colourRepository.findAll();
    }

    @Override
    public Optional<Colour> findById(Long id) {
        return colourRepository.findById(id);
    }

    @Override
    public Colour save(Colour colour) {
        return colourRepository.save(colour);
    }

    @Override
    public void deleteById(Long id) {
        colourRepository.deleteById(id);
    }
}
