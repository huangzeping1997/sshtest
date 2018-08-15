package com.java1234.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="t_notice")
public class Notice {
    private int id;
    private String title;
    private String content;
    private Date createTime;

    @Id
    @GeneratedValue(generator = "_native")
    @GenericGenerator(name = "_native",strategy = "native")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Lob
    @Column(columnDefinition = "TEXT")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
