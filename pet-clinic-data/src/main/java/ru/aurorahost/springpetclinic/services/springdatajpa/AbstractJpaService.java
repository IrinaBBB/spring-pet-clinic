package ru.aurorahost.springpetclinic.services.springdatajpa;

import org.springframework.data.repository.CrudRepository;
import ru.aurorahost.springpetclinic.model.BaseEntity;
import ru.aurorahost.springpetclinic.services.CrudService;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractJpaService<T extends BaseEntity, R extends CrudRepository<T, Long>>
        implements CrudService<T, Long> {

    protected R repository;

    public AbstractJpaService(R repository) {
        this.repository = repository;
    }

    @Override
    public Set<T> findAll() {
        Set<T> objects = new HashSet<>();
        repository.findAll().forEach(objects::add);
        return objects;
    }

    @Override
    public T findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public T save(T object) {
        return repository.save(object);
    }

    @Override
    public void delete(T object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}