package com.leyou.item.mapper;

import com.leyou.item.pojo.SpecGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/15  20:28
 */
public interface SpecGroupMapper {

    List<SpecGroup> querySpecGroup(SpecGroup specGroup);

    void addSpecGroup(SpecGroup specGroup);
}
