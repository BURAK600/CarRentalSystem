package com.burak.carrentalsystem.utility;

import com.burak.carrentalsystem.repository.entity.Default;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public class ServiceManager<T extends Default, ID> implements IService<T, ID> {
    /**
     * MusteriRepository
     * UrunRepository
     * SatisRepository
     * @param t
     * @return
     */
    private final JpaRepository<T, ID> repository;
    public ServiceManager(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T t) {
        t.setCreateDate(System.currentTimeMillis());
        return repository.save(t);
    }

    @Override
    public Iterable<T> saveAll(Iterable<T> t) {
        return repository.saveAll(t);
    }

    @Override
    public T update(T t) {
        t.setUpdateDate(System.currentTimeMillis());
        return repository.save(t);
    }

    @Override
    public void delete(T t) {
        repository.delete(t);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public T findById(ID id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }
}
