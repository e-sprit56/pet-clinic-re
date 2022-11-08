package com.whitetip.petclinicre.bootstrap;

import com.whitetip.petclinicre.model.Owner;
import com.whitetip.petclinicre.model.Pet;
import com.whitetip.petclinicre.model.PetType;
import com.whitetip.petclinicre.model.Vet;
import com.whitetip.petclinicre.services.OwnerService;
import com.whitetip.petclinicre.services.PetTypeService;
import com.whitetip.petclinicre.services.VetService;
import com.whitetip.petclinicre.services.map.OwnerServiceMap;
import com.whitetip.petclinicre.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setCity("Warszawa");
        owner1.setAddress("Krasiczynska 123");
        owner1.setTelephoneNumber("1234556");

        Pet mikePet = new Pet();
        mikePet.setName("As");
        mikePet.setPetType(savedDogPetType);
        mikePet.setOwner(owner1);
        mikePet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikePet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setCity("Krakow");
        owner2.setAddress("Wawelska 123");
        owner2.setTelephoneNumber("87576476");

        Pet fionaPet = new Pet();
        fionaPet.setName("Poosch");
        fionaPet.setPetType(savedCatPetType);
        fionaPet.setBirthDate(LocalDate.now());
        fionaPet.setOwner(owner2);
        owner2.getPets().add(fionaPet);

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded vets....");

    }
}
