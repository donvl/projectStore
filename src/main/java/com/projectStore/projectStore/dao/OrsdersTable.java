package com.projectStore.projectStore.dao;

import com.projectStore.projectStore.entity.OrdersTable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 111 on 23.05.2019.
 */
public interface OrsdersTable extends JpaRepository<OrdersTable, Long> {
}
