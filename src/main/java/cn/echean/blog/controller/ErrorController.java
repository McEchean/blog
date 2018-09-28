package cn.echean.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author whf
 */
@Controller
public class ErrorController {
    @RequestMapping("/404")
    public String getErrorPage() {
        return "app/404";
    }
}
