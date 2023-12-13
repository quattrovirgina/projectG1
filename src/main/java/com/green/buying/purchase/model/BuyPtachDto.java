package com.green.buying.purchase.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class BuyPtachDto {
    private int productPk;
    private int categoryPk;
    private String productNm;
    private String memo;

}
