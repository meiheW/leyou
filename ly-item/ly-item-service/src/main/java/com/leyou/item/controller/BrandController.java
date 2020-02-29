package com.leyou.item.controller;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Brand;
import com.leyou.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/06  15:56
 */
@RestController
@ResponseBody
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("/page")
    public PageResult<Brand> queryBrandByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy", required = false) String sortBy,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "key", required = false) String key) {
        PageResult<Brand> result = this.brandService.queryBrandByPageAndSort(page,rows,sortBy,desc, key);
        return result;
    }

    @PostMapping
    public void saveBrand(Brand brand, @RequestParam("cids")List<Long> cids){
        brandService.saveBrand(brand, cids);
    }
    @GetMapping("/cid/{cid}")
    public List<Brand> queryBrandByCid(@PathVariable("cid") Long cid){
        return brandService.queryBrandByCid(cid);
    }

    @GetMapping("{id}")
    public Brand queryBrandById(@PathVariable("id") Long id){
        return brandService.queryBrandById(id);
    }

}
