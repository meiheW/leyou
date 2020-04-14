package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/15  20:13
 */
@Table(name = "tb_spec_group")
@Data
public class SpecGroup {

    @Id
    private Long id;

    private Long cid;

    private String name;

    @Transient
    private List<SpecGroupParam> params;
}
