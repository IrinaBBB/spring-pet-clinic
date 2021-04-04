package ru.aurorahost.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.aurorahost.springpetclinic.model.Owner;
import ru.aurorahost.springpetclinic.repositories.OwnerRepository;
import ru.aurorahost.springpetclinic.services.OwnerService;

import javax.transaction.Transactional;

@Service
@Profile("springdatajpa")
@Transactional
public class OwnerSDJpaService
        extends AbstractSDJpaService<Owner, OwnerRepository>
        implements OwnerService {

    public OwnerSDJpaService(OwnerRepository repository) {
        super(repository);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }
}
