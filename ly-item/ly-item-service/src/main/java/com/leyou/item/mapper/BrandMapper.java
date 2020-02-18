package com.leyou.item.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/06  15:52
 */
public interface BrandMapper {

    Brand queryById(Long id);

    Long queryBrandCount(@Param("key") String key);

    List<Brand> queryBrandList(@Param("currentIndex")Integer currentIndex,
                               @Param("pageSize")Integer pageSize,
                               @Param("sortBy")String sortBy,
                               @Param("desc")Boolean desc,
                               @Param("key")String key);

    Integer insert(@Param("brand") Brand brand);

    Integer insertCategoryBrand(@Param("brand") Brand brand, @Param("cid") Long cid);

    List<Brand> queryBrandByCid(Long cid);
}
