package com.projectStore.projectStore.serviceImpl;

import com.projectStore.projectStore.dao.SellsDao;
import com.projectStore.projectStore.entity.Sells;
import com.projectStore.projectStore.service.SellsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class SellsServiceImpl implements SellsService {

    @Autowired
    SellsDao sellsDao;

    @Override
    public Sells finById(Long id) {
        return sellsDao.getOne(id);

    }

    @Override
    public List<Sells> findAll() {
        return sellsDao.findAll();
    }

    @Override
    public Sells save(Sells obj) {
        return sellsDao.save(obj);
    }

    @Override
    public void delete(Sells obj) {
        sellsDao.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        sellsDao.deleteById(id);
    }

    @Override
    public void upDate(Sells obj) {
        sellsDao.saveAndFlush(obj);
    }

    @Override
    public List<Sells> findAll(Specification spec) {
        return sellsDao.findAll((Sort) spec);
    }

    @Override
    public void saveAll(Collection collection) {
        sellsDao.saveAll(collection);
    }
}
