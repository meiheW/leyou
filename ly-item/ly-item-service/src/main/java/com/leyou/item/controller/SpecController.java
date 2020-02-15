package com.leyou.item.controller;

import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.service.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/15  20:24
 */
@RestController
@RequestMapping("/spec/group")
public class SpecController {

    @Autowired
    private SpecService specService;

    @GetMapping("/list/{cid}")
    public List<SpecGroup> querySpecGroup(@PathVariable("cid") Long cid){
        return specService.querySpecGroup(cid);
    }

    @PostMapping("/add")
    public void addSpecGroup(@RequestBody SpecGroup specGroup){
        specService.addSpecGroup(specGroup);
    }

    @PostMapping("/edit")
    public void editSpecGroup(@RequestBody SpecGroup specGroup){
        specService.addSpecGroup(specGroup);
    }

    @DeleteMapping("/delete/{cid}")
    public void delete(@PathVariable("cid") Long cid){
        specService.deleteSpecDelete(cid);
    }

}
