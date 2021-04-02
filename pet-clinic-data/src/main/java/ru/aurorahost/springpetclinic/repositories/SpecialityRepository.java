package ru.aurorahost.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.aurorahost.springpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {

}
