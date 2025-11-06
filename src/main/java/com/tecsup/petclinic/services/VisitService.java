package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Visit;
import java.util.List;
import java.util.Optional;

public interface VisitService {

    Visit create(Visit visit);

    Optional<Visit> findById(Long id);

    List<Visit> findAll();

    Visit update(Visit visit);

    void delete(Long id);
}
