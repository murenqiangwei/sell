package com.qst.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
/*
商品（包含类目）
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    //为什么不返回ProductInfo？出于安全和隐私的考虑，新建
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
