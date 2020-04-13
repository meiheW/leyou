package com.leyou.item.controller;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.dto.SkuDto;
import com.leyou.item.dto.SpuBo;
import com.leyou.item.dto.SpuDto;
import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.Spu;
import com.leyou.item.pojo.SpuDetail;
import com.leyou.item.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/16  21:11
 */
@RestController
@RequestMapping("/goods")
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

    @PostMapping("/add")
    public void insertGoods(@RequestBody SpuBo spuBo){
        goodsService.insertGoods(spuBo);
    }

    @PostMapping("/edit")
    public void updateGoods(@RequestBody SpuBo spuBo){
        goodsService.updateGoods(spuBo);
    }

    @GetMapping("/spu/detail/{id}")
    public SpuDetail querySpuDetailById(@PathVariable("id") Long spuId){
        return goodsService.querySpuDetailById(spuId);
    }

    @GetMapping("/sku/list")
    public List<SkuDto> querySkuList(@RequestParam("id") Long spuId){
        return goodsService.querySkuBySpuId(spuId);
    }


    @GetMapping("/spu/{id}")
    public SpuDto querySpuById(@PathVariable("id") Long spuId) {
        return goodsService.querySpuById(spuId);
    }

}
