package com.leyou.item.controller;

import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/05  0:39
 */
@RestController
@ResponseBody
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/list")
    public List<Category> queryList(@RequestParam("pid")Long pid){
        return categoryService.queryByPid(pid);
    }


    @RequestMapping("/list/ids")
    public List<Category> queryByIds(@RequestParam("ids")List<Long> ids){
        return categoryService.queryByIds(ids);
    }



}
