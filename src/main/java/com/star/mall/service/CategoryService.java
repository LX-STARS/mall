package com.star.mall.service;

import com.star.mall.pojo.Category;

import java.util.List;

/**
 * @author: star
 * @Date: 2021/7/11
 * @version: 1.0
 */
public interface CategoryService {
    /**
     * 添加商品类别
     * @param category 商品
     */
    void categoryAdded(Category category);

    /**
     * 查询商品类别
     *
     * @return categoryList商品集合
     */
    List<Category> categoryQueryList();

}
