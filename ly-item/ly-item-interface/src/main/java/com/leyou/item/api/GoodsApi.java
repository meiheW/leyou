package com.leyou.item.api;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.dto.SpuBo;
import com.leyou.item.dto.SpuDto;
import com.leyou.item.pojo.SpuDetail;
import org.springframework.web.bind.annotation.*;

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
}
