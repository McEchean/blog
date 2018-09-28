package cn.echean.blog.controller;

import cn.echean.blog.entities.BeanHelper;
import cn.echean.blog.entities.nodeentitis.ArticleEntity;
import cn.echean.blog.entities.nodeentitis.OneCentence;
import cn.echean.blog.service.BlogService;
import cn.echean.blog.service.OneCentenceService;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/blog")
public class BlogController {

    private final BlogService blogService;
    private final OneCentenceService oneCentenceService;

    public BlogController(BlogService blogService, OneCentenceService oneCentenceService) {
        this.blogService = blogService;
        this.oneCentenceService = oneCentenceService;
    }

    /**
     * 分类后文章列表
     * @param name
     * @return
     */
    @RequestMapping("/category/{name}")
    public BeanHelper getBlogList(@PathVariable("name")String name) {
        BeanHelper beanHelper = new BeanHelper();
        ArrayList<ArticleEntity> articles = blogService.getBlogListByCategory(name);
        beanHelper.success("success").add("data",articles);
        return beanHelper;
    }

    /**
     * 按需排序文章
     * @return
     */
    @RequestMapping("/sortArticles/{param}/{limit}")
    public BeanHelper getHotArticle(@PathVariable("param")String param,@PathVariable("limit")Integer limit) {
        BeanHelper beanHelper = new BeanHelper();
        ArrayList<ArticleEntity> articles = blogService.getSortedArticle(param,limit);
        beanHelper.success("success").add("data", articles);
        return beanHelper;
    }

    /**
     * 每日一句
     * @return
     */
    @RequestMapping("/onecentence")
    public BeanHelper getOneCentence() {
        BeanHelper beanHelper = new BeanHelper();
        OneCentence oneCentence = oneCentenceService.getOneCentence();
        beanHelper.success("success").add("data",oneCentence);
        return beanHelper;
    }

    @RequestMapping("/search/{param}")
    public BeanHelper getSearch(@PathVariable("param")String param) {
        BeanHelper beanHelper = new BeanHelper();
        ArrayList<ArticleEntity> articleEntities = blogService
    }

    @RequestMapping("/getAllCategory")
    public BeanHelper getAllCategory() {
        BeanHelper beanHelper = new BeanHelper();
        ArrayList<String> allCategory = blogService.getAllCategory();
        beanHelper.success("success").add("data",allCategory);
        return beanHelper;
    }


}
