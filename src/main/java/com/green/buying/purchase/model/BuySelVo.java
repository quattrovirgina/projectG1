package com.green.buying.purchase.model;

import lombok.Data;

@Data

public class BuySelVo {
    private int productPk;
    private String categoryNm;
    private String productNm;
    private String memo;
    private int buyingCheck;
    private String BuyingDate;
    private String createdAt;
}
