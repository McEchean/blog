package cn.echean.blog.controller;

import cn.echean.blog.entities.BeanHelper;
import cn.echean.blog.entities.nodeentitis.ArticleEntity;
import cn.echean.blog.service.ArticleService;
import cn.echean.blog.service.RTabService;
import cn.echean.blog.service.TabService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class test {

    private final ArticleService articleService;
    private final RTabService rTabService;
    private final TabService tabService;

    public test(ArticleService articleService, RTabService rTabService, TabService tabService) {
        this.articleService = articleService;
        this.rTabService = rTabService;
        this.tabService = tabService;
    }

    @RequestMapping("/index")
    public ModelAndView t() {
        BeanHelper beanHelper = new BeanHelper();
        ArrayList<ArticleEntity> articleEntities = (ArrayList<ArticleEntity>) articleService.getAllArticle(25);
        beanHelper.success("success").add("data",articleEntities);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject(beanHelper);
        return mv;
    }
    @RequestMapping("/bbb")
    public String a() {
        return "bbb";
    }

    @RequestMapping("/blog")
    public String b() {
        return "blog";
    }

    @RequestMapping("/contact")
    public String c() {
        return "contact";
    }

}
