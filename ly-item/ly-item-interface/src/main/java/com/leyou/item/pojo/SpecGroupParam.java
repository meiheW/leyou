package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author meihewang
 * @date 2020/02/15  23:04
 */
@Table(name = "tb_spec_group")
@Data
public class SpecGroupParam {

    @Id
    private Long id;

    private Long cid;

    private Long groupId;

    private String name;

    private Boolean numeric;

    private String unit;

    private Boolean generic;

    private Boolean searching;

    private String segments;
}
