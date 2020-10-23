package com.lucian.blog.front.mapper;

import com.lucian.blog.entity.Article;
import com.lucian.blog.entity.PageInfo;

import java.util.List;

public interface ArticleMapper {
    /**
     * 首页
     * @param page 当前页
     * @param limit 当前页最大数据数
     * @return 文章集合
     */
    List<Article> getArticles(Integer page, Integer limit);

    /**
     * 获取分页信息
     * @param article 文章信息
     * @return 分页信息
     */
    PageInfo getPageInfo(Article article);

    /**
     * 获取分页信息
     *
     * @return 分页信息
     */
    PageInfo getPageInfo();
}
