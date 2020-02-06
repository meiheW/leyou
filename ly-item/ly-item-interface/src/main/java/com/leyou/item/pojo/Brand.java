package com.leyou.item.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author meihewang
 * @date 2020/02/06  15:41
 */

@Table(name = "tb_brand")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
    @Id
    private Long id;
    private String name;// 品牌名称
    private String image;// 品牌图片
    private Character letter;
}