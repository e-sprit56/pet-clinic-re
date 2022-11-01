package com.whitetip.petclinicre.services;

import com.whitetip.petclinicre.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
