package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/05  0:37
 */
public interface CategoryMapper {

    Category queryById(Long id);

    List<Category> queryCategoryByIds(@Param("ids") List<Long> ids);

    List<Category> queryCategoryByPid(Long pid);


}
