package com.leyou.item.api;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/03/01  20:57
 */
public interface BrandApi {
    /**
     * 根据id查商品品牌
     * @param id
     * @return
     */
    @GetMapping("/brand/{id}")
    Brand queryBrandById(@PathVariable("id") Long id);
}
