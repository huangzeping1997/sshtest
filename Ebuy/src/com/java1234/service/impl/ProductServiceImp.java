package com.java1234.service.impl;

import com.java1234.dao.BaseDAO;
import com.java1234.entity.PageBean;
import com.java1234.entity.Product;
import com.java1234.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("productService")
public class ProductServiceImp implements ProductService{

    @Autowired
    BaseDAO<Product> dao;

    @Override
    public List<Product> findProductList(Product product, PageBean pageBean) {
        List<Object> list = new LinkedList<Object>();
        StringBuffer hql = new StringBuffer("from Product");
        if(product != null){
            if(product.getHot() == 1){
                hql.append(" and hot = 1 order by hotTime desc");
            }else if(product.getSpecialPrice() == 1){
                hql.append(" and specialPrice = 1 order by specialPriceTime desc");
            }
        }
        return dao.find(hql.toString().replaceFirst("and","where"),list,pageBean);
    }

}
