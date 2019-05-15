package com.qst.sell.service;

import com.qst.sell.dataobject.ProductInfo;
import com.qst.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(PageRequest pageable);//分页

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);//传入购物车（商品id和数量）

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

//    //上架
//    ProductInfo onSale(String productId);
//
//    //下架
//    ProductInfo offSale(String productId);
}
