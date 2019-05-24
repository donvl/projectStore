package com.projectStore.projectStore.serviceImpl;


import com.projectStore.projectStore.dao.DescriptionDao;
import com.projectStore.projectStore.entity.Description;
import com.projectStore.projectStore.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class DescriptionServiceImpl implements DescriptionService {

    @Autowired
    DescriptionDao descriptionDao;

    @Override
    public Description finById(Long id) {
        return descriptionDao.getOne(id);
    }

    @Override
    public List<Description> findAll() {
        return descriptionDao.findAll();
    }

    @Override
    public Description save(Description obj) {
        return descriptionDao.save(obj);
    }

    @Override
    public void delete(Description obj) {
        descriptionDao.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        descriptionDao.deleteById(id);
    }

    @Override
    public void upDate(Description obj) {
        descriptionDao.saveAndFlush(obj);
    }

    @Override
    public List<Description> findAll(Specification spec) {
        return descriptionDao.findAll(spec);
    }

    @Override
    public void saveAll(Collection collection) {
        descriptionDao.saveAll(collection);
    }
}
