package com.leyou.item.test;

import com.leyou.LyItemService;
import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpuDetail;
import com.leyou.item.service.GoodsService;
import com.leyou.item.service.SpecService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/15  21:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LyItemService.class)
public class SpecTest {

    @Autowired
    SpecService specService;
    @Autowired
    GoodsService goodsService;

    @Test
    public void querySpecGroup(){
        List<SpecGroup> specGroups = specService.querySpecGroup(1L);
        System.out.println(specGroups);
    }

    @Test
    public void querySpecDetail(){
        SpuDetail spuDetail = goodsService.querySpuDetailById(230L);
        System.out.println(spuDetail);
    }


}
