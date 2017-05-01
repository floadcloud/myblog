package com.floadcloud.myblog.service;

import com.floadcloud.myblog.entity.Category;

import java.util.List;

/**
 * Created by luohuilong on 2017/5/1.
 */
public interface CategoryService {

    /**
     * 查询所有分类
     * @return
     */
    List<Category> getList();
}
