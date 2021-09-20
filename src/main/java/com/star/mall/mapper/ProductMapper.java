package com.star.mall.mapper;

import com.star.mall.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: star
 * @Date: 2021/7/13
 * @version: 1.0
 */
@Mapper
public interface ProductMapper {
    /**
     * 添加商品系列
     *
     * @param product
     */
    void productAdd(Product product);
    /**
     * 查询商品系列
     *
     * @return
     */
    List<Product> productList();
    /**
     * 修改商品系列
     *
     * @param product
     * @return
     */
    boolean productUpdate(Product product);
    /**
     * 删除商品系列
     *
     * @return
     */
    boolean productDelete(Product product);
}
