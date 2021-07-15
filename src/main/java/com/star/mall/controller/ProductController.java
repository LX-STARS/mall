package com.star.mall.controller;

/**
 * @author: star
 * @Date: 2021/7/13
 * @version: 1.0
 */

import com.star.mall.pojo.Product;
import com.star.mall.service.ProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品系列
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 添加商品系列
     *
     * @param product
     */
    @RequestMapping("/add")
    public void productAdd(@RequestBody Product product) {
        productService.productAdd(product);
    }

    /**
     * 查询商品系列
     *
     * @return
     */
    @RequestMapping("/list")
    public List<Product> productList() {
        List<Product> productList = productService.productList();
        return productList;
    }

    /**
     * 修改商品系列
     *
     * @param product
     * @return
     */
    @RequestMapping("/update")
    public boolean productUpdate(@RequestBody Product product) {
        if (productService.productUpdate(product)) {
            return true;
        }
        return false;
    }

    /**
     * 删除商品系列
     *
     * @return
     */
    @RequestMapping("/delete")
    public String productDelete(@RequestBody Product product) {
        if (productService.productDelete(product)) {
            return "成功删除！";
        }
        return "删除失败！";
    }
}
