package com.java1234.service.impl;

import com.java1234.dao.BaseDAO;
import com.java1234.entity.Tag;
import com.java1234.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("tagService")
public class TagServiceImp implements TagService{

    @Resource
    BaseDAO<Tag> dao;

    @Override
    public List<Tag> findTagList() {
        return dao.find("from Tag");
    }
}
