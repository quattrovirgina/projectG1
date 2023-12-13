package com.green.buying.purchase;

import com.green.buying.purchase.common.ResVo;
import com.green.buying.purchase.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor

public class Pservice {
    private final Pmapper pmapper;

    public ResVo Postit(BuyInsDto dto) { // postproduct
        int result = pmapper.Buyins(dto);

        if(result == 0) {
            return new ResVo(0);
        }
        return new ResVo(1);
    }

    public List<BuySelVo> BuySel(BuySelDto dto) { // getproduct
        int result = dto.getCheckpoint();

        return pmapper.BuySel(dto);
    }

    public ResVo UpdateIt(BuyPtachDto dto) { // putproduct
        int result = pmapper.BuyEdit(dto);

        if(result == 0) {
            return new ResVo(0);
        }
        return new ResVo(1);
    }

    public ResVo EraseIt(BuyDelDto dto) { // deleteproduct
        int result = pmapper.BuyDel(dto);

        if(result == 0) {
            return new ResVo(0);
        }
        return new ResVo(1);
    }

    public ResVo Complete(BuyCheckDto dto) { // patchproductcheck
        int result = pmapper.BuyCheck(dto);

        if(result == 0) { // 구매완료 했을때 result가 0일 경우
            return new ResVo(0); // buyingcheck값을 1로 바꾸고
        }
        return new ResVo(1);
    }
}
