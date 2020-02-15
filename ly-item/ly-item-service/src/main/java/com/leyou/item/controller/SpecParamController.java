package com.leyou.item.controller;

import com.leyou.item.pojo.SpecGroupParam;
import com.leyou.item.service.SpecParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/15  23:27
 */
@RestController
@RequestMapping("/spec/param")
public class SpecParamController {

    @Autowired
    SpecParamService specParamService;

    @GetMapping("/list")
    public List<SpecGroupParam> queryGroupParam(Long gid){
        return specParamService.queryByGid(gid);
    }

    @PostMapping("/add")
    public void addGroupParam(@RequestBody SpecGroupParam specGroupParam){
        specParamService.addGroupParam(specGroupParam);
    }

    @PostMapping("/edit")
    public void editGroupParam(@RequestBody SpecGroupParam specGroupParam){
        specParamService.editGroupParam(specGroupParam);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGroupParam(@PathVariable("id") Long id){
        specParamService.deleteGroupParam(id);
    }
}
