package ru.aurorahost.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.aurorahost.springpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
