package com.projectStore.projectStore.dao;

import com.projectStore.projectStore.entity.GoodsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface GoodsTypeDao extends JpaRepository<GoodsType, Long>, JpaSpecificationExecutor<GoodsType> {
}
