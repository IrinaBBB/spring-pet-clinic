package ru.aurorahost.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.aurorahost.springpetclinic.model.Owner;
import ru.aurorahost.springpetclinic.model.Pet;
import ru.aurorahost.springpetclinic.model.PetType;
import ru.aurorahost.springpetclinic.model.Vet;
import ru.aurorahost.springpetclinic.services.OwnerService;
import ru.aurorahost.springpetclinic.services.PetTypeService;
import ru.aurorahost.springpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService,
                      VetService vetService,
                      PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Bikerel");
        owner1.setCity("Miami");
        owner1.setTelephoneNumber("12344556");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennan");
        owner2.setAddress("123 Bikerel");
        owner2.setCity("Miami");
        owner2.setTelephoneNumber("12344556");

        Pet fionasCat = new Pet();
        fionasCat.setName("Meow");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);



        System.out.println("Loaded Owners...");

        ownerService.save(owner2);

        Vet vet3 = new Vet();
        vet3.setFirstName("Sam");
        vet3.setLastName("Axe");

        vetService.save(vet3);

        Vet vet4 = new Vet();
        vet4.setFirstName("Jesse");
        vet4.setLastName("Porter");

        vetService.save(vet4);

        System.out.println("Loaded Vets...");
    }
}
