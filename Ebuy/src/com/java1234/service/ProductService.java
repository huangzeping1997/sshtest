package com.java1234.service;

import com.java1234.entity.PageBean;
import com.java1234.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findProductList(Product product, PageBean pageBean);
}
