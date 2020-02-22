package com.leyou.item.mapper;

import com.leyou.item.pojo.SpuDetail;
import org.apache.ibatis.annotations.Param;

/**
 * @author meihewang
 * @date 2020/02/16  21:03
 */
public interface SpuDetailMapper {

    void insertSpuDetail(@Param("spuDetail") SpuDetail spuDetail, @Param("spuId")Long spuId);
}
