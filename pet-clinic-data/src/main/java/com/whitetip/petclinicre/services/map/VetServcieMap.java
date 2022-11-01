package com.whitetip.petclinicre.services.map;

import com.whitetip.petclinicre.model.Vet;
import com.whitetip.petclinicre.services.CrudService;

import java.util.Set;

public class VetServcieMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);

    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
