package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/05  0:37
 */
public interface CategoryMapper {

    Category queryById(int id);

    List<Category> queryByPid(int pid);


}
