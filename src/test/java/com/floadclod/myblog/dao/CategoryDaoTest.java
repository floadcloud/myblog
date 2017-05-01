package com.floadclod.myblog.dao;

import com.floadcloud.myblog.BaseTest;
import com.floadcloud.myblog.dao.CategoryDao;
import com.floadcloud.myblog.entity.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by luohuilong on 2017/4/30.
 */
public class CategoryDaoTest extends BaseTest {

    @Autowired
    private CategoryDao categoryDao;

    @Test
    public void testAdd() throws Exception{
        Category category = new Category();
        category.setName("测试");
        categoryDao.add(category);
    }

    @Test
    public void testQueryById() throws Exception{
        Category category = categoryDao.queryById(1);
        System.out.println(category);
    }
}
