package com.qst.sell.service.impl;

import com.qst.sell.dataobject.ProductCategory;
import com.qst.sell.repository.ProductCategoryRepository;
import com.qst.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
类目
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    //引入dao
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findById(Integer categoryId) {
        return repository.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
