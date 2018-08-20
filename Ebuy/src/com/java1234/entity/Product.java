package com.java1234.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_product")
public class Product {

    private int id;
    private String name;
    private int price;
    private int stock;
    private String proPic;
    private String description;
    private int hot;
    private Date hotTime;
    private int specialPrice;
    private Date specialPriceTime;

    private ProductBigType productBigType;
    private ProductSmallType productSmallType;
    //private List<Order> orderList = new ArrayList<Order>();

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProPic() {
        return proPic;
    }

    public void setProPic(String proPic) {
        this.proPic = proPic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public Date getHotTime() {
        return hotTime;
    }

    public void setHotTime(Date hotTime) {
        this.hotTime = hotTime;
    }

    public int getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(int specialPrice) {
        this.specialPrice = specialPrice;
    }

    public Date getSpecialPriceTime() {
        return specialPriceTime;
    }

    public void setSpecialPriceTime(Date specialPriceTime) {
        this.specialPriceTime = specialPriceTime;
    }

    @ManyToOne
    @JoinColumn(name = "bigTypeId")
    public ProductBigType getProductBigType() {
        return productBigType;
    }

    public void setProductBigType(ProductBigType productBigType) {
        this.productBigType = productBigType;
    }

    @ManyToOne
    @JoinColumn(name = "smallTypeId")
    public ProductSmallType getProductSmallType() {
        return productSmallType;
    }

    public void setProductSmallType(ProductSmallType productSmallType) {
        this.productSmallType = productSmallType;
    }

//    @OneToMany
//    @JoinColumn(name = "productId")
//    public List<Order> getOrderList() {
//
//        return orderList;
//    }
//
//    public void setOrderList(List<Order> orderList) {
//        this.orderList = orderList;
//    }
}
