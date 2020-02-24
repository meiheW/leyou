package com.leyou.item.dto;

import com.leyou.item.pojo.Spu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Transient;

/**
 * @author meihewang
 * @date 2020/02/16  22:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpuDto extends Spu {

    @Transient
    private String bname;
    @Transient
    private String cname;

}
