package com.star.mall.pojo;

/**
 * @author: star
 * @Date: 2021/7/10
 * @version: 1.0
 */

import lombok.Data;

/**
 * 商品系列表
 */
@Data
public class Product {
    /**
     * 商品系列 ID
     */
    private int productId;
    /**
     * 商品类别
     */
    private String cartId;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 描述
     */
    private String descn;
}
