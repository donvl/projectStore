package com.projectStore.projectStore.dao;

import com.projectStore.projectStore.entity.OrdersHeader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 111 on 23.05.2019.
 */
public interface OrdersHeaderDao extends JpaRepository<OrdersHeader, Long> {
}
