package com.floadcloud.myblog.dao;

import com.floadcloud.myblog.BaseTest;
import com.floadcloud.myblog.dao.ArticleDao;
import com.floadcloud.myblog.entity.Article;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by luohuilong on 2017/5/1.
 */
public class ArticleDaoTest extends BaseTest {
    @Autowired
    private ArticleDao articleDao;

    @Test
    public void testAdd() throws Exception{
        Article article = new Article();
        article.setCategoryId(1);
        article.setTitle("第一个标题");
        article.setContent("第一个内容");
        article.setCreateTime(new Date());
        articleDao.add(article);
        System.out.println(article.getArticleId());
    }

    @Test
    public void testUpdate() throws Exception{
        Article article = new Article();
        article.setArticleId(1);
        article.setCategoryId(1);
        article.setTitle("second title");
        article.setContent("second content");
        articleDao.update(article);
    }

    @Test
    public void testDelete() throws Exception{
        articleDao.delete(1);
    }

    @Test
    public void testQueryById() throws Exception{
        Article article = articleDao.queryById(2);
        System.out.println(article);
    }

    @Test
    public void testQueryAll() throws Exception{
        List<Article> articleList = articleDao.queryAll(0,5);
        System.out.println(articleList);
    }
}
