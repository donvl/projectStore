package com.projectStore.projectStore.serviceImpl;

import com.projectStore.projectStore.dao.OrdersHeaderDao;
import com.projectStore.projectStore.entity.OrdersHeader;
import com.projectStore.projectStore.service.OrdersHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class OrdersHeaderServiceImpl implements OrdersHeaderService {

    @Autowired
    OrdersHeaderDao ordersHeaderDao;

    @Override
    public OrdersHeader finById(Long id) {
        return ordersHeaderDao.getOne(id);
    }

    @Override
    public List<OrdersHeader> findAll() {
        return ordersHeaderDao.findAll();
    }

    @Override
    public OrdersHeader save(OrdersHeader obj) {
        return ordersHeaderDao.save(obj);
    }

    @Override
    public void delete(OrdersHeader obj) {
        ordersHeaderDao.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        ordersHeaderDao.deleteById(id);
    }

    @Override
    public void upDate(OrdersHeader obj) {
        ordersHeaderDao.saveAndFlush(obj);
    }

    @Override
    public List<OrdersHeader> findAll(Specification spec) {
        return ordersHeaderDao.findAll(spec);
    }

    @Override
    public void saveAll(Collection collection) {
        ordersHeaderDao.saveAll(collection);
    }
}
