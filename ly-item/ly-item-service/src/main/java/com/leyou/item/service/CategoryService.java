package com.leyou.item.service;

import com.google.common.collect.Lists;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/05  0:38
 */
@Service
public class CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> query(int id) {
        Category category = categoryMapper.queryById(id);
        return Lists.newArrayList(category);
    }
}
