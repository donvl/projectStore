package com.projectStore.projectStore.dao;

import com.projectStore.projectStore.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface GoodsDao extends JpaRepository<Goods, Long>, JpaSpecificationExecutor<Goods> {
}
