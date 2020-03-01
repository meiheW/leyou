package com.leyou.search.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author meihewang
 * @date 2020/03/01  20:59
 */
@FeignClient("item-service")
public interface BrandClient extends BrandApi {
}
