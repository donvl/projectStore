package com.projectStore.projectStore.service;

import org.springframework.data.jpa.domain.Specification;

import java.util.Collection;
import java.util.List;

public interface BaseDbMethod<T> {
    T findById(Long id);

    List<T> findAll();

    T save(T obj);

    void delete(T obj);

    void deleteById(Long id);

    void update(T obj);

    List<T> findAll(Specification spec);

    void saveAll(Collection collection);
    
}