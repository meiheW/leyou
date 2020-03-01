package com.leyou.search.client;

import com.leyou.item.api.SpecApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author meihewang
 * @date 2020/03/01  21:04
 */
@FeignClient("item-service")
public interface SpecClient extends SpecApi {
}
