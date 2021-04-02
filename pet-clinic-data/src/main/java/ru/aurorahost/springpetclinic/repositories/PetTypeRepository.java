package ru.aurorahost.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.aurorahost.springpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
