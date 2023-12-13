package com.green.buying.purchase;

import com.green.buying.purchase.common.ResVo;
import com.green.buying.purchase.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/product")

public class Pcontroller {
    private final Pservice pservice;

    @PostMapping
    public ResVo PostItNow(@RequestBody BuyInsDto dto) {
        return pservice.Postit(dto);
    }

    @GetMapping
    public List<BuySelVo> BuySel(BuySelDto dto) {
        log.info("dto result : {}", dto);
        return pservice.BuySel(dto);

    }

    @PutMapping
    public ResVo UpdateIt(@RequestBody BuyPtachDto dto) {
        log.info("dto result : {}", dto);
        return pservice.UpdateIt(dto);
    }

    @DeleteMapping
    public ResVo DeleteIt(@RequestBody BuyDelDto dto) {
        log.info("dto delete result: {}", dto);
        return pservice.EraseIt(dto);
    }

    @PatchMapping
    public ResVo Buied(@RequestBody BuyCheckDto dto) {
        log.info("dto decied to buy: {}", dto);
        return pservice.Complete(dto);
    }
}
