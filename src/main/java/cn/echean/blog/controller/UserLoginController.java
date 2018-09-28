package cn.echean.blog.controller;

import cn.echean.blog.service.UserService;
import cn.echean.blog.util.StrUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 98382
 */
@Controller
@RequestMapping("/login")
public class UserLoginController {
    private final UserService userService;
    public UserLoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/index")
    public String login() {
        return "manager/login";
    }

    @RequestMapping(value = "/userlogin",method = RequestMethod.POST)
    public String userLogin(HttpServletRequest request,String username,String userpwd) {
        if(StrUtil.tripBlank(username) != "" && StrUtil.tripBlank(userpwd) != "") {
            if(userService.checkUser(username,userpwd)) {
                request.getSession().setAttribute("user",username);
                return "manager/index";
            }
        }
        return "manager/login";
    }
}
