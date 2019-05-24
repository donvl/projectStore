package com.projectStore.projectStore.dao;


import com.projectStore.projectStore.entity.OrdersTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrdersTableDao extends JpaRepository<OrdersTable, Long>, JpaSpecificationExecutor<OrdersTable> {
}
