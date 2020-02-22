package com.leyou.item.dto;

import com.leyou.item.pojo.Sku;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Transient;

/**
 * @author meihewang
 * @date 2020/02/23  2:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkuDto extends Sku {

    /**
     * 库存
     */
    @Transient
    private Integer stock;
}
