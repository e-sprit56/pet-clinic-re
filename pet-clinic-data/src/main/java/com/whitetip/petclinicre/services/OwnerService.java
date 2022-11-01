package com.whitetip.petclinicre.services;

import com.whitetip.petclinicre.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner finByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
