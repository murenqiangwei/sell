package com.qst.sell.repository;

import com.qst.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}