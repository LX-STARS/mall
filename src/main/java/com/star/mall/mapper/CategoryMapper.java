package com.star.mall.mapper;

/**
 * @author: star
 * @Date: 2021/7/11
 * @version: 1.0
 */

import com.star.mall.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品类别类
 */
@Mapper
public interface CategoryMapper {
    /**
     * 添加商品类别
     *
     * @param category 商品
     */
    void categoryAdded(Category category);

    /**
     * 查询商品类别
     *
     * @return categoryList商品集合
     */
    List<Category> categoryQueryList();

    /**
     * 删除商品类别
     *
     * @param id 删除商品需要的ID
     */
    void categoryDelete(int id);

    /**
     * 修改商品类别
     *
     */
    void categoryUpdate(Category category);
}
