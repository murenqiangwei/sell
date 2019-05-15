package com.qst.sell.service;

import com.qst.sell.dataobject.ProductCategory;

import java.util.List;

/*
 类目
 */
public interface CategoryService {
    //后台管理：
    //查询一条记录
    ProductCategory findOne(Integer categoryId);
    //查询所有
    List<ProductCategory> findAll();

    //买家端用到的：
    //通过Type来查
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    //新增和更新
    ProductCategory save(ProductCategory productCategory);
}
