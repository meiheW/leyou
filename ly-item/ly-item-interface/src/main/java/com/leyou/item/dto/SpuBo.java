package com.leyou.item.dto;

import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.SpuDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Transient;
import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/23  1:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpuBo extends SpuDto{
    /**
     * 商品详情
     */
    @Transient
    SpuDetail spuDetail;
    /**
     * sku列表
     */
    @Transient
    List<SkuDto> skus;
}
