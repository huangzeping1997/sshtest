package com.java1234.service.impl;

import com.java1234.dao.BaseDAO;
import com.java1234.entity.ProductBigType;
import com.java1234.service.ProductBigTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("productBigTypeService")
public class ProductBigTypeServiceImp implements ProductBigTypeService{

    @Resource
    BaseDAO<ProductBigType> baseDAO;

//    public BaseDAO<ProductBigType> getBaseDAO() {
//        return baseDAO;
//    }
//
//    @Autowired
//    public void setBaseDAO(BaseDAO<ProductBigType> baseDAO) {
//        this.baseDAO = baseDAO;
//    }

    @Override
    public List<ProductBigType> findAllProductBigType() {
        return baseDAO.find("from ProductBigType");
    }
}
