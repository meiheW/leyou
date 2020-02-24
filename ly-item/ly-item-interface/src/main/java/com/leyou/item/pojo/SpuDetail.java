package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author meihewang
 * @date 2020/02/16  20:59
 */
@Table(name="tb_spu_detail")
@Data
public class SpuDetail {

    /**
     * 对应的SPU的id
     */
    @Id
    private Long spuId;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 商品特殊规格的名称及可选值模板
     */
    @Column(name = "spec_template")
    private String specialSpec;
    /**
     * 商品的全局规格属性
     */
    @Column(name = "specifications")
    private String genericSpec;
    /**
     * 包装清单
     */
    private String packingList;
    /**
     * 售后服务
     */
    private String afterService;
}
