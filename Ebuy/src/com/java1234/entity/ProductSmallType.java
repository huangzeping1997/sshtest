package com.java1234.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_productsmalltype")
public class ProductSmallType {

    private int id;
    private String name;
    private String remarks;

    private ProductBigType bigType;
    private List<Product> productList = new ArrayList<Product>();

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

    //
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "bigTypeId")
    public ProductBigType getBigType() {
        return bigType;
    }

    public void setBigType(ProductBigType bigType) {
        this.bigType = bigType;
    }

    @OneToMany(mappedBy = "productSmallType")
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
