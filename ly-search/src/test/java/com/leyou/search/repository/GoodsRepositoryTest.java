package com.leyou.search.repository;

import com.google.common.collect.Lists;
import com.leyou.common.pojo.PageResult;
import com.leyou.item.dto.SpuDto;
import com.leyou.search.client.GoodsClient;
import com.leyou.search.pojo.Goods;
import com.leyou.search.service.SearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

/**
 * @author meihewang
 * @date 2020/03/01  21:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsRepositoryTest {
    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private ElasticsearchTemplate template;
    @Autowired
    private GoodsClient goodsClient;
    @Autowired
    private SearchService searchService;

    /**
     * 测试代码
     * 用于一次性生成es索引和mapping
     */
    @Test
    public void testCreateIndex() {
        template.createIndex(Goods.class);
        template.putMapping(Goods.class);
    }


    /**
     * 查询spu并将Goods数据导入索引库
     */
    @Test
    public void loadData() throws IOException {
        int page = 1;
        int rows = 100;
        int size = 0;
        do {
            PageResult<SpuDto> result = goodsClient.querySpuByPage(page, rows, true, null);
            List<SpuDto> spuList = result.getItems();
            List<Goods> goodsList = Lists.newArrayList();
            for (SpuDto sd : spuList) {
                Goods goods = searchService.buildGoods(sd);
                goodsList.add(goods);
            }
            goodsRepository.saveAll(goodsList);
            size = spuList.size();
        }while(rows == size);
    }


}
