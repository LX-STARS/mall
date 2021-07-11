package com.star.mall.service.Impl;

import com.star.mall.mapper.CategoryMapper;
import com.star.mall.pojo.Category;
import com.star.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: star
 * @Date: 2021/7/11
 * @version: 1.0
 */

/**
 * 商品类别类
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    /**
     * 添加商品类别
     *
     * @param category 商品
     */
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void categoryAdded(Category category) {
        categoryMapper.categoryAdded(category);
    }

    /**
     * 查询商品类别
     *
     * @return categoryList商品集合
     */
    @Override
    public List<Category> categoryQueryList() {
        return categoryMapper.categoryQueryList();
    }
}
