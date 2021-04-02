package ru.aurorahost.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.aurorahost.springpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
