package com.projectStore.projectStore.dao;


import com.projectStore.projectStore.entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 111 on 23.05.2019.
 */
public interface DescriptionDao extends JpaRepository<Description, Long> {
}
