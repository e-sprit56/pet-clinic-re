package com.whitetip.petclinicre.services;

import com.whitetip.petclinicre.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner finByLastName(String lastName);

}
