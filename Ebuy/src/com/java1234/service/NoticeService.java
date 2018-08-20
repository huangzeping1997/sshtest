package com.java1234.service;

import com.java1234.entity.Notice;
import com.java1234.entity.PageBean;

import java.util.List;

public interface NoticeService {

    public List<Notice> findNoticeList(Notice notice, PageBean pageBean);
}
