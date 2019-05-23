package com.projectStore.projectStore.dao;


import com.projectStore.projectStore.entity.Sells;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellsDao extends JpaRepository<Sells, Long> {
}
