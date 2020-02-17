package com.leyou.item.controller;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.dto.SpuDto;
import com.leyou.item.pojo.Spu;
import com.leyou.item.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meihewang
 * @date 2020/02/16  21:11
 */
@RestController
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @GetMapping("/spu/page")
    public PageResult<SpuDto> querySpuByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer pageNo,
            @RequestParam(value = "rows", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "saleable", defaultValue = "false") Boolean saleable,
            @RequestParam(value = "key", required = false) String key) {
        return goodsService.querySpuByPage(saleable, key, pageNo, pageSize);
    }

}
