package ru.aurorahost.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.aurorahost.springpetclinic.model.Owner;
import ru.aurorahost.springpetclinic.model.PetType;
import ru.aurorahost.springpetclinic.model.Vet;
import ru.aurorahost.springpetclinic.services.OwnerService;
import ru.aurorahost.springpetclinic.services.PetTypeService;
import ru.aurorahost.springpetclinic.services.VetService;

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

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennan");

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
