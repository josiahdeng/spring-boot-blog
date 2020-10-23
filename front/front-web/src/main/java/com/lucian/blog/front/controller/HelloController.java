package com.lucian.blog.front.controller;

import com.lucian.blog.entity.PageInfo;
import com.lucian.blog.front.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    ArticleMapper articleMapper;

    @GetMapping("/hello")
    public PageInfo test(){
        return articleMapper.getPageInfo();
    }
}
