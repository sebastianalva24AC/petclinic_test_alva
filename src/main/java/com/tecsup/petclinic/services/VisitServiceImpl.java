package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Visit;
import com.tecsup.petclinic.repositories.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitServiceImpl implements VisitService {

    @Autowired
    private VisitRepository visitRepository;

    @Override
    public Visit create(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public Optional<Visit> findById(Long id) {
        return visitRepository.findById(id);
    }

    @Override
    public List<Visit> findAll() {
        return visitRepository.findAll();
    }

    @Override
    public Visit update(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public void delete(Long id) {
        visitRepository.deleteById(id);
    }
}
