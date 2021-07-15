package com.star.mall.mapper;

/**
 * @author: star
 * @Date: 2021/7/15
 * @version: 1.0
 */

import org.apache.ibatis.annotations.Mapper;
import com.star.mall.pojo.Item;

import java.util.List;

/**
 * 商品条目
 */
@Mapper
public interface ItemMapper {
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
