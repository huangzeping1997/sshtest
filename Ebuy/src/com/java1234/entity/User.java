package com.java1234.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="t_user")
public class User {

    private int id;
    private String trueName;
    private String userName;
    private String password;
    private String sex;
    private Date birthday;
    private String dentityCode;
    private String email;
    private String mobile;
    private String address;
    private int status=1;

    private List<Order> orderlist = new ArrayList<Order>();

    @Id
    @GeneratedValue(generator = "_native")
    @GenericGenerator(name="_native", strategy = "native")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(length = 10)
    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    @Column(length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(length = 5)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(length = 20)
    public String getDentityCode() {
        return dentityCode;
    }

    public void setDentityCode(String dentityCode) {
        this.dentityCode = dentityCode;
    }

    @Column(length = 20)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(length = 20)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(length = 20)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @OneToMany(targetEntity = Order.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    public List<Order> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(List<Order> orderlist) {
        this.orderlist = orderlist;
    }
}