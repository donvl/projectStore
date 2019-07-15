package com.projectStore.projectStore.serviceImpl;

import com.projectStore.projectStore.dao.OrderStatusDao;
import com.projectStore.projectStore.dao.OrdersTableDao;
import com.projectStore.projectStore.entity.OrdersTable;
import com.projectStore.projectStore.service.OrdersTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class OrdersTableServiceImpl implements OrdersTableService {

    @Autowired
    OrdersTableDao ordersTableDao;

    @Override
    public OrdersTable findById(Long id) {
        return ordersTableDao.getOne(id);
    }

    @Override
    public List<OrdersTable> findAll() {
        return ordersTableDao.findAll();
    }

    @Override
    public OrdersTable save(OrdersTable obj) {
        return ordersTableDao.save(obj);
    }

    @Override
    public void delete(OrdersTable obj) {
        ordersTableDao.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        ordersTableDao.deleteById(id);
    }

    @Override
    public void update(OrdersTable obj) {
        ordersTableDao.saveAndFlush(obj);
    }

    @Override
    public List<OrdersTable> findAll(Specification spec) {
        return ordersTableDao.findAll(spec);
    }

    @Override
    public void saveAll(Collection collection) {
        ordersTableDao.saveAll(collection);
    }
}
