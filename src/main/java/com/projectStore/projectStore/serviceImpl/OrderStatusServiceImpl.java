package com.projectStore.projectStore.serviceImpl;

import com.projectStore.projectStore.dao.OrderStatusDao;
import com.projectStore.projectStore.entity.OrderStatus;
import com.projectStore.projectStore.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {

    @Autowired
    OrderStatusDao orderStatusDao;

    @Override
    public OrderStatus finById(Long id) {
        return orderStatusDao.getOne(id);
    }

    @Override
    public List<OrderStatus> findAll() {
        return orderStatusDao.findAll();
    }

    @Override
    public OrderStatus save(OrderStatus obj) {
        return orderStatusDao.save(obj);
    }

    @Override
    public void delete(OrderStatus obj) {
        orderStatusDao.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        orderStatusDao.deleteById(id);
    }

    @Override
    public void upDate(OrderStatus obj) {
        orderStatusDao.saveAndFlush(obj);
    }

    @Override
    public List<OrderStatus> findAll(Specification spec) {
        return orderStatusDao.findAll(spec);
    }

    @Override
    public void saveAll(Collection collection) {
        orderStatusDao.saveAll(collection);
    }
}
