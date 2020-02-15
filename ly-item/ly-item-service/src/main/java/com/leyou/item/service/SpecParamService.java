package com.leyou.item.service;

import com.google.common.collect.Lists;
import com.leyou.item.mapper.SpecParamMapper;
import com.leyou.item.pojo.SpecGroupParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/15  23:30
 */
@Service
public class SpecParamService {

    @Autowired
    SpecParamMapper specParamMapper;

    public List<SpecGroupParam> queryByGid(Long gid) {
        return specParamMapper.queryByGid(gid);
    }

    public void addGroupParam(SpecGroupParam specGroupParam) {
        List<SpecGroupParam> specGroupParams = Lists.newArrayList(specGroupParam);
        specParamMapper.addGroupParamList(specGroupParams);
    }

    public void editGroupParam(SpecGroupParam specGroupParam) {
        specParamMapper.editGroupParam(specGroupParam);
    }

    public void deleteGroupParam(Long id) {
        specParamMapper.deleteGroupParam(id);
    }
}
