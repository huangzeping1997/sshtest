package com.java1234.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table
@Entity(name = "t_productBigType")
public class ProductBigType {

    private int id;
    private String name;
    private String remarks;

    private List<Product> productList = new ArrayList<Product>();
    private List<ProductSmallType> productSmallTypeList = new ArrayList<ProductSmallType>();

    @Id
    @GeneratedValue(generator = "_native")
    @GenericGenerator(name = "_native",strategy = "native")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @OneToMany(mappedBy = "productBigType")
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    //取大类时取出小类，立即加载
    @OneToMany(mappedBy = "bigType",fetch = FetchType.EAGER)
    public List<ProductSmallType> getProductSmallTypeList() {
        return productSmallTypeList;
    }

    public void setProductSmallTypeList(List<ProductSmallType> productSmallTypeList) {
        this.productSmallTypeList = productSmallTypeList;
    }
}
