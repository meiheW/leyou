package com.leyou.page.client;

import com.leyou.item.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author meihewang
 * @date 2020/03/01  15:53
 */
@FeignClient("item-service")
public interface CategoryClient extends CategoryApi {
}
