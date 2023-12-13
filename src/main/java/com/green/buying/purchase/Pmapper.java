package com.green.buying.purchase;

import com.green.buying.purchase.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Pmapper {
    int Buyins(BuyInsDto dto);
    List<BuySelVo> BuySel(BuySelDto dto);

    int BuyEdit(BuyPtachDto dto);

    int BuyDel(BuyDelDto dto);

    int BuyCheck(BuyCheckDto dto);
}
