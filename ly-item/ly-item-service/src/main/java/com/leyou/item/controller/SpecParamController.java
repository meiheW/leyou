package com.leyou.item.controller;

import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecGroupParam;
import com.leyou.item.service.SpecParamService;
import com.leyou.item.service.SpecService;
import com.sun.org.apache.xpath.internal.operations.Bool;
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
    public List<SpecGroupParam> queryGroupParam(
            @RequestParam(value = "gid", required = false) Long gid,
            @RequestParam(value = "cid", required = false) Long cid,
            @RequestParam(value = "searching", required = false) Boolean searching,
            @RequestParam(value = "generic", required = false) Boolean generic) {
        return specParamService.querySpecGroupParam(gid, cid, searching, generic);
    }

    @PostMapping("/add")
    public void addGroupParam(@RequestBody SpecGroupParam specGroupParam) {
        specParamService.addGroupParam(specGroupParam);
    }

    @PostMapping("/edit")
    public void editGroupParam(@RequestBody SpecGroupParam specGroupParam) {
        specParamService.editGroupParam(specGroupParam);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGroupParam(@PathVariable("id") Long id) {
        specParamService.deleteGroupParam(id);
    }

    @GetMapping("/group")
    List<SpecGroup> queryGroupByCid(@RequestParam("cid") Long cid) {
        return specParamService.queryListByCid(cid);
    }
}
