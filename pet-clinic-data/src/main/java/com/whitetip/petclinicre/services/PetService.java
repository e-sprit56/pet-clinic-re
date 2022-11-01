package com.whitetip.petclinicre.services;

import com.whitetip.petclinicre.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
