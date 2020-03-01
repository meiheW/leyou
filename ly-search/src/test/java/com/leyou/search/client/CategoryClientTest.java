package com.leyou.search.client;

import com.google.common.collect.Lists;
import com.leyou.item.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @author meihewang
 * @date 2020/03/01  16:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryClientTest {

    @Autowired
    private CategoryClient categoryClient;

    @Test
    public void queryCategoryByIds() {
        List<Category> categories = categoryClient.queryCategoryByIds(Lists.newArrayList(74L, 75L, 76L));
        System.out.println(categories);
    }

}

