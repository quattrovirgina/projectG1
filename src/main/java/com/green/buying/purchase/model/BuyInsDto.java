package com.green.buying.purchase.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data

public class BuyInsDto {
    @JsonIgnore
    private int productPk;

    private int userPk;
    private int category;
    private String name;
    private String memo;

}
