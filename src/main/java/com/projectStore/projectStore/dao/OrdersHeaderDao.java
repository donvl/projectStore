package com.projectStore.projectStore.dao;

import com.projectStore.projectStore.entity.OrdersHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface OrdersHeaderDao extends JpaRepository<OrdersHeader, Long>, JpaSpecificationExecutor<OrdersHeader> {
}
