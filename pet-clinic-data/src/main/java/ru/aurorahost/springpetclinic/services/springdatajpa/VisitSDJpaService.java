package ru.aurorahost.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.aurorahost.springpetclinic.model.Visit;
import ru.aurorahost.springpetclinic.repositories.VisitRepository;
import ru.aurorahost.springpetclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService
    extends AbstractSDJpaService<Visit, VisitRepository>
    implements VisitService {


    public VisitSDJpaService(VisitRepository repository) {
        super(repository);
    }
}
