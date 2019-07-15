package com.projectStore.projectStore.dao;

import com.projectStore.projectStore.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderStatusDao extends JpaRepository<OrderStatus, Long>, JpaSpecificationExecutor<OrderStatus> {
}
