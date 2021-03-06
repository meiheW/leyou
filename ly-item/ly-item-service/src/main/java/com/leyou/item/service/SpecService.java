package com.leyou.item.service;

import com.leyou.item.mapper.SpecGroupMapper;
import com.leyou.item.pojo.SpecGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/15  20:27
 */
@Service
public class SpecService {

    @Autowired
    SpecGroupMapper specGroupMapper;

    public List<SpecGroup> querySpecGroup(Long cid) {
        SpecGroup specGroup = new SpecGroup();
        specGroup.setCid(cid);
        return specGroupMapper.querySpecGroup(specGroup);
    }

    public void addSpecGroup(SpecGroup specGroup) {
        if(specGroup.getId()==null){
            specGroupMapper.addSpecGroup(specGroup);
        }else{
            specGroupMapper.updateSpecGroup(specGroup);
        }
    }


    public void deleteSpecDelete(Long cid) {
        specGroupMapper.deleteSpecGroup(cid);
    }
}
