package com.projectStore.projectStore.dao;

import com.projectStore.projectStore.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 111 on 23.05.2019.
 */
public interface OrderStatusDao extends JpaRepository<OrderStatus, Long> {
}
