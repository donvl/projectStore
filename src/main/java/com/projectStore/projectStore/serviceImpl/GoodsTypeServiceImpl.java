package com.projectStore.projectStore.serviceImpl;

import com.projectStore.projectStore.dao.GoodsTypeDao;
import com.projectStore.projectStore.entity.GoodsType;
import com.projectStore.projectStore.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired
    GoodsTypeDao goodsTypeDao;

    @Override
    public GoodsType finById(Long id) {
        return goodsTypeDao.getOne(id);
    }

    @Override
    public List<GoodsType> findAll() {
        return goodsTypeDao.findAll();
    }

    @Override
    public GoodsType save(GoodsType obj) {
        return goodsTypeDao.save(obj);
    }

    @Override
    public void delete(GoodsType obj) {
        goodsTypeDao.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        goodsTypeDao.deleteById(id);
    }

    @Override
    public void upDate(GoodsType obj) {
        goodsTypeDao.saveAndFlush(obj);
    }

    @Override
    public List<GoodsType> findAll(Specification spec) {
        return goodsTypeDao.findAll(spec);
    }

    @Override
    public void saveAll(Collection collection) {
        goodsTypeDao.saveAll(collection);
    }
}
