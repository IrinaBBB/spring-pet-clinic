package ru.aurorahost.springpetclinic.services.map;

import org.springframework.stereotype.Service;
import ru.aurorahost.springpetclinic.model.Pet;
import ru.aurorahost.springpetclinic.services.CrudService;
import ru.aurorahost.springpetclinic.services.PetService;

import java.util.Set;

@Service
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
        return super.save(pet);
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
