package com.projectStore.projectStore.dao;


import com.projectStore.projectStore.entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface DescriptionDao extends JpaRepository<Description, Long>, JpaSpecificationExecutor<Description> {

}
