package com.lucian.blog.entity;

import java.util.Date;

public class Author {
    private Integer id;

    private String name;

    //出生年月日
    private Date birth;
    // 个性签名
    private String personQuote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPersonQuote() {
        return personQuote;
    }

    public void setPersonQuote(String personQuote) {
        this.personQuote = personQuote;
    }
}
