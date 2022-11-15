package com.whitetip.petclinicre.repositories;

import com.whitetip.petclinicre.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
