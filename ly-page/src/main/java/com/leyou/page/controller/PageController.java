package com.leyou.page.controller;

import com.leyou.page.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author meihewang
 * @date 2020/04/14  9:22
 */
@Controller
public class PageController {

    @Autowired
    PageService pageService;


    @GetMapping("item/{id}.html")
    public String tiItemPage(@PathVariable("id") Long spuId, Model model){
        Map<String, Object> attributes = pageService.loadModel(spuId);
        model.addAllAttributes(attributes);
        return "item";
    }

}
