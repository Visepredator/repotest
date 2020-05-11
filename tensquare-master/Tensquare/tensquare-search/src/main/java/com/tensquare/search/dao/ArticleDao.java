package com.tensquare.search.dao;

import com.tensquare.search.pojo.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @program: tensquare-parent
 * @Date: 2019-3-29 17:46
 * @Author: 846602483
 * @Description:
 */
public interface ArticleDao extends ElasticsearchRepository<Article,String> {


    public Page<Article> findByTitleOrContentLike(String title, String content, Pageable pageable);
}
