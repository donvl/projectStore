package com.projectStore.projectStore.serviceImpl;

import com.projectStore.projectStore.dao.CommentsDao;
import com.projectStore.projectStore.entity.Comments;
import com.projectStore.projectStore.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    CommentsDao commentsDao;

    @Override
    public Comments findById(Long id) {
        return commentsDao.getOne(id);
    }

    @Override
    public List<Comments> findAll() {
        return commentsDao.findAll();
    }

    @Override
    public Comments save(Comments obj) {
        return commentsDao.save(obj);
    }

    @Override
    public void delete(Comments obj) {
        commentsDao.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        commentsDao.deleteById(id);
    }

    @Override
    public void update(Comments obj) {
        commentsDao.saveAndFlush(obj);
    }

    @Override
    public List<Comments> findAll(Specification spec) {
        return commentsDao.findAll(spec);
    }

    @Override
    public void saveAll(Collection collection) {
        commentsDao.saveAll(collection);
    }
}
