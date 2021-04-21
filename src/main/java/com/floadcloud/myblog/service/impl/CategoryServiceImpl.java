package com.floadcloud.myblog.service.impl;

import com.floadcloud.myblog.dao.CategoryDao;
import com.floadcloud.myblog.entity.Category;
import com.floadcloud.myblog.service.CategoryService;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luohuilong on 2017/5/1.
 */
@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<Category> getList() {
        List<Category> categories = Lists.newArrayList();
        //categoryDao.queryAll(0, 1000);
        categories.add(Category.builder().name("lhl").categoryId(1).build());
        log.info("request list finish,categories:{}", categories);
        return categories;
    }
}
