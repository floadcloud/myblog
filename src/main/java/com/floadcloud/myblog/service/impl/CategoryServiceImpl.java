package com.floadcloud.myblog.service.impl;

import com.floadcloud.myblog.dao.CategoryDao;
import com.floadcloud.myblog.entity.Category;
import com.floadcloud.myblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luohuilong on 2017/5/1.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> getList() {
        return categoryDao.queryAll(0,1000);
    }
}
