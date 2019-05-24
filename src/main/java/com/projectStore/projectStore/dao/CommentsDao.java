package com.projectStore.projectStore.dao;

import com.projectStore.projectStore.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CommentsDao extends JpaRepository<Comments, Long>, JpaSpecificationExecutor<Comments> {
}
