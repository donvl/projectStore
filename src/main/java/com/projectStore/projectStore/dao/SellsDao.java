package com.projectStore.projectStore.dao;


import com.projectStore.projectStore.entity.Sells;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SellsDao extends JpaRepository<Sells, Long>, JpaSpecificationExecutor<Sells> {
}
