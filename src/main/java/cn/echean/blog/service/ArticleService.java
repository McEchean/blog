package cn.echean.blog.service;

import cn.echean.blog.entities.nodeentitis.ArticleEntity;
import cn.echean.blog.repository.ArticleEntityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class ArticleService {
    private final ArticleEntityRepository articleEntityRepository;

    public ArticleService(ArticleEntityRepository articleEntityRepository) {
        this.articleEntityRepository = articleEntityRepository;
    }

    /*闯创建一篇文章*/
    @Transactional(rollbackFor = {})
    public ArticleEntity createArticle(ArticleEntity articleEntity) {
        return articleEntityRepository.save(articleEntity);
    }

    /*根据名字查询文章*/
    public ArticleEntity findByNameService(String name) {
        return articleEntityRepository.findByName(name);
    }

    /*查询和文章有关的所有信息*/
    public Collection<ArticleEntity> getAllArticle(int limit) {
        return articleEntityRepository.getAll(limit);
    }

}
