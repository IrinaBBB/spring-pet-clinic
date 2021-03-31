package ru.aurorahost.springpetclinic.services;

import ru.aurorahost.springpetclinic.model.Pet;
import ru.aurorahost.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
