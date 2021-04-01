package ru.aurorahost.springpetclinic.services.map;

import ru.aurorahost.springpetclinic.model.Pet;
import ru.aurorahost.springpetclinic.services.CrudService;
import ru.aurorahost.springpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap
        extends AbstractMapService<Pet, Long>
        implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}
