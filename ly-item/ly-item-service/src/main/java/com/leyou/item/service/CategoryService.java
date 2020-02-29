package com.leyou.item.service;

import com.google.common.collect.Lists;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

/**
 * @author meihewang
 * @date 2020/02/05  0:38
 */
@Service
public class CategoryService {

    @Autowired
    CategoryMapper categoryMapper;


    public List<Category> query(Long id) {
        return queryByIds(Lists.newArrayList(id));
    }

    public List<Category> queryByIds(List<Long> ids) {
        List<Category> category = categoryMapper.queryCategoryByIds(ids);
        return category;
    }

    public List<Category> queryByPid(Long pid) {
        List<Category> categoryList = categoryMapper.queryCategoryByPid(pid);
        return Lists.newArrayList(categoryList);
    }
}
