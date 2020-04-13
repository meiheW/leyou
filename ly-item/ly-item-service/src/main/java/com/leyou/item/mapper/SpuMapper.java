package com.leyou.item.mapper;


import com.leyou.item.dto.SpuBo;
import com.leyou.item.pojo.Spu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/16  21:02
 */
public interface SpuMapper {

    List<Spu> querySpuList(Boolean saleable, String key, Integer currentIndex, Integer pageSize);

    Long querySpuCount(@Param("saleable")Boolean saleable, @Param("key")String key);

    void insertSpu(@Param("spuBo")SpuBo spuBo);

    void updateSpu(@Param("spuBo")SpuBo spuBo);

    Spu queryById(@Param("id")Long id);
}
