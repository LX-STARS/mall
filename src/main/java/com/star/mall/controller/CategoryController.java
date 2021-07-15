package com.star.mall.controller;

/**
 * @author: star
 * @Date: 2021/7/10
 * @version: 1.0
 */

import com.star.mall.pojo.Category;
import com.star.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品类别类
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 添加商品类别
     *
     * @param category 商品
     */
    @RequestMapping("/add")
    public void categoryAdded(@RequestBody Category category) {
        categoryService.categoryAdded(category);
    }

    /**
     * 查询商品类别
     *
     * @return categoryList商品集合
     */
    @RequestMapping("/list")
    public List<Category> categoryQueryList() {
        List<Category> categoryList = categoryService.categoryQueryList();
        return categoryList;
    }

    /**
     * 删除商品类别
     */
    @RequestMapping("/delete")
    public void categoryDelete(@RequestBody Category category) {
        categoryService.categoryDelete(category);
    }

    /**
     * 修改商品类别
     */
    @RequestMapping("/update")
    public void categoryUpdate(@RequestBody Category category) {
        categoryService.categoryUpdate(category);
    }
}
