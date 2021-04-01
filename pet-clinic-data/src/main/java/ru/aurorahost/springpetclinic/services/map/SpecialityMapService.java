package ru.aurorahost.springpetclinic.services.map;


import org.springframework.stereotype.Service;
import ru.aurorahost.springpetclinic.model.Speciality;
import ru.aurorahost.springpetclinic.services.SpecialitiesService;

import java.util.Set;

@Service
public class SpecialityMapService
        extends AbstractMapService<Speciality, Long>
        implements SpecialitiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }
}
