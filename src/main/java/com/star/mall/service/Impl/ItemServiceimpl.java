package com.star.mall.service.Impl;

import com.star.mall.mapper.ItemMapper;
import com.star.mall.pojo.Item;
import com.star.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: star
 * @Date: 2021/7/15
 * @version: 1.0
 */

/**
 * 商品条目
 */
@Service
public class ItemServiceimpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;

    /**
     * 新增商品条目
     *
     * @param item
     */
    @Override
    public void itemAdd(Item item) {
        itemMapper.itemAdd(item);
    }

    /**
     * 查询商品条目
     *
     * @return
     */
    @Override
    public List<Item> itemList() {
        return itemMapper.itemList();
    }

    /**
     * 修改商品条目
     *
     * @param item
     */
    @Override
    public void itemUpdate(Item item) {
        itemMapper.itemUpdate(item);
    }

    /**
     * 删除商品条目
     *
     * @param item
     */
    @Override
    public void itemDelete(Item item) {
        itemMapper.itemDelete(item);
    }
}
