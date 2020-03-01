package com.leyou.item.api;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.dto.SkuDto;
import com.leyou.item.dto.SpuBo;
import com.leyou.item.dto.SpuDto;
import com.leyou.item.pojo.SpuDetail;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/03/01  20:50
 */
public interface GoodsApi {


    /**
     * 根据id查询detail
     * @param spuId spuId
     * @return SpuDetail
     */
    @GetMapping("goods/spu/detail/{id}")
    SpuDetail querySpuDetailById(@PathVariable("id") Long spuId);


    /**
     * 根据spuId查询sku
     * @param spuId spuId
     * @return sku列表
     */
    @GetMapping("/goods/sku/list")
    List<SkuDto> querySkuList(@RequestParam("id") Long spuId);


    /**
     * 查询spu
     * @param pageNo
     * @param pageSize
     * @param saleable
     * @param key
     * @return
     */
    @GetMapping("/goods/spu/page")
    PageResult<SpuDto> querySpuByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer pageNo,
            @RequestParam(value = "rows", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "saleable", defaultValue = "false") Boolean saleable,
            @RequestParam(value = "key", required = false) String key);
}
