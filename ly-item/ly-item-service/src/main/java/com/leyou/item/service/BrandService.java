package com.leyou.item.service;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.mapper.BrandMapper;
import com.leyou.item.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/06  15:57
 */
@Service
public class BrandService {

    @Autowired
    BrandMapper brandMapper;

    public PageResult<Brand> queryBrandByPageAndSort(Integer pageNo, Integer pageSize, String sortBy, Boolean desc, String key) {
        Long count = brandMapper.queryBrandCount(key);
        List<Brand> brandList = brandMapper.queryBrandList((pageNo-1)*pageSize, pageSize, sortBy, desc, key);

        PageResult<Brand> prb = new PageResult<>();
        prb.setTotal(count);
        prb.setItems(brandList);
        return prb;

    }

    @Transactional
    public void saveBrand(Brand brand, List<Long> cids){
        Integer id = brandMapper.insert(brand);
        if(id==0){
            return;
        }
        for(Long cid : cids){
            brandMapper.insertCategoryBrand(brand, cid);
        }
    }
}
