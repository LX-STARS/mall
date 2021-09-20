package com.star.mall.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: star
 * @Date: 2021/7/10
 * @version: 1.0
 */

/**
 * 商品类别表
 */
@Data
public class Category {
    /**
     * 商品类别 ID
     */
    private int cartId;
    /**
     * 商品类别名称
     */
    private String name;
    /**
     * 描述
     */
    private String descn;

}
