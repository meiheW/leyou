package com.leyou.item.service;

import com.google.common.collect.Lists;
import com.leyou.common.pojo.PageResult;
import com.leyou.item.dto.SpuDto;
import com.leyou.item.mapper.BrandMapper;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.mapper.SpuMapper;
import com.leyou.item.pojo.Brand;
import com.leyou.item.pojo.Spu;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/16  21:03
 */
@Service
public class GoodsService {

    @Autowired
    SpuMapper spuMapper;
    @Autowired
    BrandMapper brandMapper;
    @Autowired
    CategoryMapper categoryMapper;

    public PageResult<SpuDto> querySpuByPage(Boolean saleable, String key, Integer pageNo, Integer pageSize) {
        PageResult pageResult = new PageResult<SpuDto>();
        Long count = spuMapper.querySpuCount(saleable, key);
        List<Spu> spuList = spuMapper.querySpuList(saleable, key, (pageNo-1)*pageSize, pageSize);
        List<SpuDto> spuDtoList = Lists.newArrayList();
        for(Spu spu : spuList){
            SpuDto spuDto = new SpuDto();
            BeanUtils.copyProperties(spu, spuDto);
            Brand brand = brandMapper.queryById(spu.getBrandId());
            spuDto.setBname(brand.getName());
            spuDto.setCname(
                categoryMapper.queryById(spu.getCid1()).getName()+"/"+
                categoryMapper.queryById(spu.getCid2()).getName()+"/"+
                categoryMapper.queryById(spu.getCid3()).getName()
            );
            spuDtoList.add(spuDto);
        }
        pageResult.setTotal(count);
        pageResult.setItems(spuDtoList);
        return pageResult;
    }
}
