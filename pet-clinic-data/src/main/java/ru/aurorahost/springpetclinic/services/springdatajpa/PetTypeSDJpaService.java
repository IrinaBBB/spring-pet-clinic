package ru.aurorahost.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.aurorahost.springpetclinic.model.PetType;
import ru.aurorahost.springpetclinic.repositories.PetTypeRepository;
import ru.aurorahost.springpetclinic.services.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService
    extends AbstractSDJpaService<PetType, PetTypeRepository>
    implements PetTypeService {

    public PetTypeSDJpaService(PetTypeRepository repository) {
        super(repository);
    }
}
