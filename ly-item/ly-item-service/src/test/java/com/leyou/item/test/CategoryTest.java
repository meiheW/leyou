package com.leyou.item.test;

import com.google.common.collect.Lists;
import com.leyou.LyItemService;
import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/03/01  1:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LyItemService.class)
public class CategoryTest {

    @Autowired
    CategoryService categoryService;

    @Test
    public void queryCategory(){
        List<Category> list = categoryService.queryByIds(Lists.newArrayList(74L, 75L, 76L));
        System.out.println(list);
    }
}
