package ru.aurorahost.springpetclinic.services.springdatajpa;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.aurorahost.springpetclinic.model.Speciality;
import ru.aurorahost.springpetclinic.repositories.SpecialityRepository;
import ru.aurorahost.springpetclinic.services.SpecialityService;


@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService
    extends AbstractSDJpaService<Speciality, SpecialityRepository>
    implements SpecialityService {

    public SpecialitySDJpaService(SpecialityRepository repository) {
        super(repository);
    }
}
