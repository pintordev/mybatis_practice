package com.pintor.mybatis.article.repository;

import com.pintor.mybatis.article.dto.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleRepository {

    @Select("""
            <script>
                SELECT *\s
                FROM article
            </script>
            """)
    List<Article> getArticles();
}
