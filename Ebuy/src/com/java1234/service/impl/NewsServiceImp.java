package com.java1234.service.impl;

import com.java1234.dao.BaseDAO;
import com.java1234.entity.News;
import com.java1234.entity.PageBean;
import com.java1234.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("newsService")
public class NewsServiceImp implements NewsService{

    @Autowired
    BaseDAO<News> dao;

    @Override
    public List<News> findNewsList(News news, PageBean pageBean) {
        List<Object> list = new LinkedList<Object>();
        String hql = "from News";
        if(pageBean != null){
            return dao.find(hql, list, pageBean);
        }else{
            return null;
        }
    }
}
