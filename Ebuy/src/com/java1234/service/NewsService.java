package com.java1234.service;

import com.java1234.entity.News;
import com.java1234.entity.PageBean;

import java.util.List;

public interface NewsService {

    public List<News> findNewsList(News news, PageBean pageBean);
}
