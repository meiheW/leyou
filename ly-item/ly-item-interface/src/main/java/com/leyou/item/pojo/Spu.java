package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author meihewang
 * @date 2020/02/16  20:52
 */
@Data
@Table(name="tb_spu")
public class Spu {
    @Id
    private Long id;
    private Long brandId;
    private Long cid1;
    private Long cid2;
    private Long cid3;
    private String title;
    private String subTitle;
    private Boolean saleable;
    private Boolean valid;
    private Date creatTime;
    private Date lastUpdateTime;
}
