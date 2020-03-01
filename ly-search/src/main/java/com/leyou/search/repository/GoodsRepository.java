package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author meihewang
 * @date 2020/03/01  21:13
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {
}
