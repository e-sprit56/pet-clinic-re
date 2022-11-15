package com.whitetip.petclinicre.repositories;

import com.whitetip.petclinicre.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
