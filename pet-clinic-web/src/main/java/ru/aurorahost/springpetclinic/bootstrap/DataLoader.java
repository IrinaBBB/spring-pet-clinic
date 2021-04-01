package ru.aurorahost.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.aurorahost.springpetclinic.model.Owner;
import ru.aurorahost.springpetclinic.model.Vet;
import ru.aurorahost.springpetclinic.services.OwnerService;
import ru.aurorahost.springpetclinic.services.VetService;
import ru.aurorahost.springpetclinic.services.map.OwnerServiceMap;
import ru.aurorahost.springpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennan");

        System.out.println("Loaded Owners...");

        ownerService.save(owner2);

        Vet vet3 = new Vet();
        vet3.setId(1L);
        vet3.setFirstName("Sam");
        vet3.setLastName("Axe");

        vetService.save(vet3);

        Vet vet4 = new Vet();
        vet4.setId(2L);
        vet4.setFirstName("Jesse");
        vet4.setLastName("Porter");

        vetService.save(vet4);

        System.out.println("Loaded Vets...");
    }
}
