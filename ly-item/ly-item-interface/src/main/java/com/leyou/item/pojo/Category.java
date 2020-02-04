package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author meihewang
 * @date 2020/02/05  0:18
 */
@Table(name="tb_category")
@Data
public class Category {
    @Id
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;
}
