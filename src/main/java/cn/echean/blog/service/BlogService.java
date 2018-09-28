package cn.echean.blog.service;

import cn.echean.blog.entities.nodeentitis.ArticleEntity;
import cn.echean.blog.repository.ArticleEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class BlogService {
    @Autowired
    ArticleEntityRepository articleEntityRepository;

    public ArrayList<ArticleEntity> getBlogListByCategory(String name) {
        Collection<ArticleEntity> articles = articleEntityRepository.getArticleEntitiesByCategory(name);
        return (ArrayList<ArticleEntity>) articles;
    }

    public ArrayList<ArticleEntity> getSortedArticle(String orderParam,Integer limit) {
        ArrayList<ArticleEntity> articleEntities = articleEntityRepository.getArticleSortByParam(orderParam,limit);
        return articleEntities;
    }

    public ArrayList<String> getAllCategory() {
        ArrayList<String> categoties = articleEntityRepository.getAllCategory();
        return categoties;
    }
}
