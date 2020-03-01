package com.leyou.item.api;

import com.leyou.item.pojo.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/03/01  20:56
 */
public interface CategoryApi {

    @RequestMapping("category/list")
    List<Category> queryList(@RequestParam("pid")Long pid);


    @RequestMapping("category/list/ids")
    List<Category> queryCategoryByIds(@RequestParam("ids")List<Long> ids);
}
