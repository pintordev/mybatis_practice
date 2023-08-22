package com.pintor.mybatis.article.repository;

import com.pintor.mybatis.article.dto.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleRepository {

    @Select("""
            <script>
                SELECT * 
                FROM article
            </script>
            """)
    List<Article> getArticles();

    @Insert("""
            <script>
                INSERT INTO article 
                SET createDate = NOW(),
                modifyDate = NOW(),
                subject = #{subject},
                content = #{content}
            </script>
            """)
    void write(@Param("subject") String subject, @Param("content") String content);

    @Select("""
            <script>
                SELECT * 
                FROM article 
                WHERE id = #{id}
            </script>
            """)
    Article getArticleById(@Param("id") Long id);
}
