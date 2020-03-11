package com.leyou.search.pojo;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Brand;
import com.leyou.item.pojo.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author meihewang
 * @date 2020/03/10  23:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchResult<T> extends PageResult {

    List<Category> categories;

    List<Brand> brands;
}
