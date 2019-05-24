package com.projectStore.projectStore.serviceImpl;

import com.projectStore.projectStore.dao.GoodsDao;
import com.projectStore.projectStore.entity.Goods;
import com.projectStore.projectStore.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsDao goodsDao;

    @Override
    public Goods finById(Long id) {
        return goodsDao.getOne(id);
    }

    @Override
    public List<Goods> findAll() {
        return goodsDao.findAll();
    }

    @Override
    public Goods save(Goods obj) {
        return goodsDao.save(obj);
    }

    @Override
    public void delete(Goods obj) {
        goodsDao.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        goodsDao.deleteById(id);
    }

    @Override
    public void upDate(Goods obj) {
        goodsDao.saveAndFlush(obj);
    }

    @Override
    public List<Goods> findAll(Specification spec) {
        return goodsDao.findAll(spec);
    }

    @Override
    public void saveAll(Collection collection) {
        goodsDao.saveAll(collection);
    }
}
