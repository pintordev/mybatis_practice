package com.pintor.mybatis.article.controller;

import com.pintor.mybatis.article.dto.Article;
import com.pintor.mybatis.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/article")
@RequiredArgsConstructor
@Controller
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("")
    public String list(Model model) {

        List<Article> articleList = this.articleService.getArticles();
        model.addAttribute("articleList", articleList);

        return "article/list";
    }
}
