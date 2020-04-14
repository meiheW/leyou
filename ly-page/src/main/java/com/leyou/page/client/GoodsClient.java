package com.leyou.page.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author meihewang
 * @date 2020/03/01  20:52
 */
@FeignClient("item-service")
public interface GoodsClient extends GoodsApi {
}
