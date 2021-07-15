package com.star.mall.service;

/**
 * @author: star
 * @Date: 2021/7/15
 * @version: 1.0
 */

import com.star.mall.pojo.Item;

import java.util.List;

/**
 * 商品条目
 */
public interface ItemService {
    /**
     * 新增商品条目
     *
     * @param item
     */
    void itemAdd(Item item);
    /**
     * 查询商品条目
     *
     * @return
     */
    List<Item> itemList();
    /**
     * 修改商品条目
     *
     * @param item
     */
    void itemUpdate(Item item);
    /**
     * 删除商品条目
     *
     * @param item
     */
    void itemDelete(Item item);
}
