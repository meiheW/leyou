package com.leyou.item.mapper;

import com.leyou.item.pojo.SpecGroupParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/02/15  23:31
 */
public interface SpecParamMapper {
    List<SpecGroupParam> querySpecGroupParam(@Param("gid") Long gid, @Param("cid") Long cid, @Param("searching") Boolean searching, @Param("generic")Boolean generic);

    void addGroupParamList(List<SpecGroupParam> specGroupParams);

    void editGroupParam(@Param("specGroupParam") SpecGroupParam specGroupParam);

    void deleteGroupParam(Long id);
}
