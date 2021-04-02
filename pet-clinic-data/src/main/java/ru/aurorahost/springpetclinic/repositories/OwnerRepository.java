package ru.aurorahost.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.aurorahost.springpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
