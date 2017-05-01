package com.floadcloud.myblog.dao;

import com.floadcloud.myblog.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by luohuilong on 2017/4/30.
 */
public interface ArticleDao {
    /**
     * 通过Id查询文章
     * @param id
     * @return
     */
    Article queryById(long id);

    /**
     * 查询所有文章
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Article> queryAll(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 新增文章
     * @param category
     * @return
     */
    int add(Article category);

    /**
     * 修改文章
     * @param category
     * @return
     */
    int update(Article category);

    /**
     * 删除文章
     * @param id
     * @return
     */
    int delete(long id);
}
