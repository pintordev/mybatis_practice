package com.pintor.mybatis.article.service;

import com.pintor.mybatis.article.dto.Article;
import com.pintor.mybatis.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public List<Article> getArticles() {
        return this.articleRepository.getArticles();
    }
}
