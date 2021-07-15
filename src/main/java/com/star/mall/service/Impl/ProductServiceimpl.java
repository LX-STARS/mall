package com.star.mall.service.Impl;

import com.star.mall.mapper.ProductMapper;
import com.star.mall.pojo.Product;
import com.star.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: star
 * @Date: 2021/7/13
 * @version: 1.0
 */
@Service
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    /**
     * 添加商品系列
     *
     * @param product
     */
    @Override
    public void productAdd(Product product) {
        productMapper.productAdd(product);
    }
    /**
     * 查询商品系列
     *
     * @return
     */
    @Override
    public List<Product> productList() {
        return productMapper.productList();
    }
    /**
     * 修改商品系列
     *
     * @param product
     * @return
     */
    @Override
    public boolean productUpdate(Product product) {
        return productMapper.productUpdate(product);
    }
    /**
     * 删除商品系列
     *
     * @return
     */
    @Override
    public boolean productDelete(Product product) {
        return productMapper.productDelete(product);
    }
}
