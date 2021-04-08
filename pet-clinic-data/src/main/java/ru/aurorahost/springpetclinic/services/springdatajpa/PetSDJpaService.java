package ru.aurorahost.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.aurorahost.springpetclinic.model.Pet;
import ru.aurorahost.springpetclinic.repositories.PetRepository;
import ru.aurorahost.springpetclinic.services.PetService;

@Service
@Profile("springdatajpa")
public class PetSDJpaService
    extends AbstractSDJpaService<Pet, PetRepository>
    implements PetService {

    public PetSDJpaService(PetRepository repository) {
        super(repository);
    }
}
