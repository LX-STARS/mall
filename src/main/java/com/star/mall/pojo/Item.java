package com.star.mall.pojo;

import lombok.Data;

/**
 * @author: star
 * @Date: 2021/7/10
 * @version: 1.0
 */

/**
 * 商品条目表
 */
@Data
public class Item {
    /**
     * 商品条目 ID
     */
    private int itemId;
    /**
     * 产品 ID
     */
    private String productId;
    /**
     * 单价
     */
    private String listPrice;
    /**
     * 进货价格
     */
    private String unitCost;
    /**
     * 供货商
     */
    private String supplier;
}
