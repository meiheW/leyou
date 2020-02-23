package com.leyou.item.test;

import com.google.common.collect.Lists;
import com.leyou.LyItemService;
import com.leyou.item.dto.SkuDto;
import com.leyou.item.dto.SpuBo;
import com.leyou.item.pojo.SpuDetail;
import com.leyou.item.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author meihewang
 * @date 2020/02/23  2:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LyItemService.class)
public class SpuTest {

    @Autowired
    GoodsService goodsService;

    @Test
    public void insetSpu() {
        SpuDetail sd = new SpuDetail();
        sd.setSpecTemplate("SpecTemplate");
        sd.setSpecifications("Specifications");
        sd.setDescription("Description");
        sd.setPackingList("PackingList");
        sd.setAfterService("AfterService");

        SpuBo sb = new SpuBo();
        sb.setTitle("xiami");
        sb.setSubTitle("xiaomi-good");
        sb.setCid1(74L);
        sb.setCid2(75L);
        sb.setCid3(76L);
        sb.setBrandId(18374L);
        sb.setSaleable(true);
        sb.setValid(true);

        SkuDto sku = new SkuDto();
        sku.setTitle("title1");
        sku.setImages("image1");
        sku.setPrice(3500L);
        sku.setIndexes("1_1_1");
        sku.setOwnSpec("1desc");
        sku.setEnable(true);
        sku.setStock(10);

        SkuDto sku1 = new SkuDto();
        sku1.setTitle("title2");
        sku1.setImages("image2");
        sku1.setPrice(3600L);
        sku1.setIndexes("1_1_2");
        sku1.setOwnSpec("2desc");
        sku1.setEnable(false);
        sku1.setStock(10);

        sb.setSkus(Lists.newArrayList(sku, sku1));
        sb.setSpuDetail(sd);
        goodsService.insertGoods(sb);
        System.out.println(sb.getId());
    }

    @Test
    public void updateSpu(){
        SpuDetail sd = new SpuDetail();
        sd.setSpecTemplate("SpecTemplate1");
        sd.setSpecifications("Specifications1");
        sd.setDescription("Description1");
        sd.setPackingList("PackingList1");
        sd.setAfterService("AfterService1");

        SpuBo sb = new SpuBo();
        sb.setId(225L);
        sb.setTitle("xiami1");
        sb.setSubTitle("xiaomi-good1");
        sb.setCid1(74L);
        sb.setCid2(75L);
        sb.setCid3(76L);
        sb.setBrandId(18374L);
        sb.setSaleable(true);
        sb.setValid(true);

        SkuDto sku = new SkuDto();
        sku.setTitle("title111");
        sku.setImages("image111");
        sku.setPrice(3500L);
        sku.setIndexes("1_1_1");
        sku.setOwnSpec("1desc");
        sku.setEnable(true);
        sku.setStock(10);

        SkuDto sku1 = new SkuDto();
        sku1.setTitle("title222");
        sku1.setImages("image2222");
        sku1.setPrice(3600L);
        sku1.setIndexes("1_1_2");
        sku1.setOwnSpec("2desc");
        sku1.setEnable(false);
        sku1.setStock(10);

        sb.setSkus(Lists.newArrayList(sku, sku1));
        sb.setSpuDetail(sd);
        goodsService.updateGoods(sb);
        System.out.println(sb.getId());
    }
}
