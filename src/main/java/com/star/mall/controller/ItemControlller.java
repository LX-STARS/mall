package com.star.mall.controller;

/**
 * @author: star
 * @Date: 2021/7/15
 * @version: 1.0
 */

import com.star.mall.pojo.Item;
import com.star.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品条目
 */
@RestController
@RequestMapping("/item")
public class ItemControlller {

    @Autowired
    private ItemService itemService;

    /**
     * 新增商品条目
     *
     * @param item
     */
    @RequestMapping("/add")
    public void itemAdd(@RequestBody Item item) {
        itemService.itemAdd(item);
    }

    /**
     * 查询商品条目
     *
     * @return
     */
    @RequestMapping("/list")
    public List<Item> itemList() {
        List<Item> itemList = itemService.itemList();
        return itemList;
    }

    /**
     * 修改商品条目
     *
     * @param item
     */
    @RequestMapping("/update")
    public void itemUpdate(@RequestBody Item item) {
        itemService.itemUpdate(item);
    }

    /**
     * 删除商品条目
     *
     * @param item
     */
    @RequestMapping("/delete")
    public void itemDelete(@RequestBody Item item) {
        itemService.itemDelete(item);
    }
}
