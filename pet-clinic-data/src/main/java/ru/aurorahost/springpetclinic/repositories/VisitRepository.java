package ru.aurorahost.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.aurorahost.springpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
