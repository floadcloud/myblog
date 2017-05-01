package com.floadcloud.myblog.dao;

import com.floadcloud.myblog.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by luohuilong on 2017/4/30.
 */
public interface CategoryDao {

    /**
     * 通过Id查询分类
     * @param id
     * @return
     */
    Category queryById(long id);

    /**
     * 查询所有分类
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Category> queryAll(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 新增分类
     * @param category
     * @return
     */
    int add(Category category);

    /**
     * 修改分类
     * @param category
     * @return
     */
    int update(Category category);

    /**
     * 删除分类
     * @param id
     * @return
     */
    int delete(long id);
}
