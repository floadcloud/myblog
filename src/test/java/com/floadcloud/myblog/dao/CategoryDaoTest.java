package com.floadcloud.myblog.dao;

import com.floadcloud.myblog.BaseTest;
import com.floadcloud.myblog.dao.CategoryDao;
import com.floadcloud.myblog.entity.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by luohuilong on 2017/4/30.
 */
public class CategoryDaoTest extends BaseTest {

    @Autowired
    private CategoryDao categoryDao;

    @Test
    public void testAdd() throws Exception{
        Category category = new Category();
        category.setName("JAVA");
        categoryDao.add(category);
        System.out.println(category.getCategoryId());
    }

    @Test
    public void testUpdate() throws Exception{
        Category category = new Category();
        category.setCategoryId(6);
        category.setName("JAVA1");
        categoryDao.update(category);
    }

    @Test
    public void testDelete() throws Exception{
        categoryDao.delete(6);
    }

    @Test
    public void testQueryById() throws Exception{
        Category category = categoryDao.queryById(1);
        System.out.println(category);
    }

    @Test
    public void testQueryAll() throws Exception{
        List<Category> categoryList = categoryDao.queryAll(0,5);
        System.out.println(categoryList);
    }
}
