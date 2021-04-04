package ru.aurorahost.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.aurorahost.springpetclinic.model.Vet;
import ru.aurorahost.springpetclinic.repositories.VetRepository;
import ru.aurorahost.springpetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService
        extends AbstractSDJpaService<Vet, VetRepository>
        implements VetService {

    public VetSDJpaService(VetRepository repository) {
        super(repository);
    }
}
