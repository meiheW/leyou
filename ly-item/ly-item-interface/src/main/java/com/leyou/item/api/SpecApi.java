package com.leyou.item.api;

import com.leyou.item.pojo.SpecGroupParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/03/01  21:03
 */
public interface SpecApi {
    @GetMapping("/spec/param/list")
    List<SpecGroupParam> queryGroupParam(
            @RequestParam(value = "gid", required = false) Long gid,
            @RequestParam(value = "cid", required = false) Long cid,
            @RequestParam(value = "searching", required = false) Boolean searching,
            @RequestParam(value="generic", required = false) Boolean generic);
}
