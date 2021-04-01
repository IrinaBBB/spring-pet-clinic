package ru.aurorahost.springpetclinic.services.map;

import org.springframework.stereotype.Service;
import ru.aurorahost.springpetclinic.model.Pet;
import ru.aurorahost.springpetclinic.model.PetType;
import ru.aurorahost.springpetclinic.model.Vet;
import ru.aurorahost.springpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMapService
        extends AbstractMapService<PetType, Long>
        implements PetTypeService {


    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }
}
