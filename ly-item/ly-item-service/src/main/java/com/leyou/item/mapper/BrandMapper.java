package com.leyou.item.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/06  15:52
 */
public interface BrandMapper {

    Long queryBrandCount(@Param("key") String key);

    List<Brand> queryBrandList(@Param("currentIndex")Integer currentIndex,
                               @Param("pageSize")Integer pageSize,
                               @Param("sortBy")String sortBy,
                               @Param("desc")Boolean desc,
                               @Param("key")String key);

    Integer insert(@Param("brand") Brand brand);
}
