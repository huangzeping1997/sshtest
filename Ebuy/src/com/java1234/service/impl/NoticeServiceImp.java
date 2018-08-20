package com.java1234.service.impl;

import com.java1234.dao.BaseDAO;
import com.java1234.entity.Notice;
import com.java1234.entity.PageBean;
import com.java1234.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@Service("noticeService")
public class NoticeServiceImp implements NoticeService{

    @Autowired
    BaseDAO<Notice> dao;

    @Override
    public List<Notice> findNoticeList(Notice notice, PageBean pageBean) {
        List<Object> list = new LinkedList<Object>();
        String hql = "from Notice";
        if(pageBean != null){
            return dao.find(hql, list, pageBean);
        }else{
            return null;
        }
    }
}
