package com.whitetip.petclinicre.repositories;

import com.whitetip.petclinicre.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
