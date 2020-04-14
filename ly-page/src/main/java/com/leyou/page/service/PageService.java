package com.leyou.page.service;

import com.leyou.item.dto.SpuBo;
import com.leyou.page.client.BrandClient;
import com.leyou.page.client.CategoryClient;
import com.leyou.page.client.GoodsClient;
import com.leyou.page.client.SpecClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.expression.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author meihewang
 * @date 2020/04/14  9:25
 */
@Service
public class PageService {
    @Autowired
    BrandClient brandClient;
    @Autowired
    CategoryClient categoryClient;
    @Autowired
    GoodsClient goodsClient;
    @Autowired
    SpecClient specClient;

    public Map<String, Object> loadModel(Long spuId) {
        Map<String, Object> model = new HashMap<>();
        SpuBo spuBo = goodsClient.querySpuById(spuId);
        model.put("spu", spuBo);
        model.put("skus", spuBo.getSkus());
        model.put("detail", goodsClient.querySpuDetailById(spuId));
        model.put("brand", brandClient.queryBrandById(spuBo.getBrandId()));
        model.put("categories", categoryClient.queryCategoryByIds(Arrays.asList(spuBo.getCid1(), spuBo.getCid2(), spuBo.getCid3())));
        model.put("specs", specClient.queryGroupByCid(spuBo.getCid3()));
        return model;
    }


}
