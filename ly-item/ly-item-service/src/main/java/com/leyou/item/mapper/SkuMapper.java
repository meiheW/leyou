package com.leyou.item.mapper;

import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.Stock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/23  2:48
 */
public interface SkuMapper {

    void insertSku(@Param("sku") Sku sku);

    void insertStock(@Param("stock") Stock stock);

    List<Sku> querySkuListBySpuId(Long spuId);

    Stock queryStockBySkuId(Long skuId);

    void deleteSkuBySpuId(Long spuId);

    void deleteStockBySkuId(Long skuId);
}
