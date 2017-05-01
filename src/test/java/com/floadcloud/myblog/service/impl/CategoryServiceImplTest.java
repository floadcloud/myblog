package com.floadcloud.myblog.service.impl;

import com.floadcloud.myblog.BaseTest;
import com.floadcloud.myblog.entity.Category;
import com.floadcloud.myblog.service.CategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by luohuilong on 2017/5/1.
 */
public class CategoryServiceImplTest extends BaseTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void testGetList() throws Exception{
        List<Category> categoryList = categoryService.getList();
        System.out.println(categoryList);
    }
}
