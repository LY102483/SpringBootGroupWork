package online.liuyang1024.controller;

import online.liuyang1024.POJO.User;
import online.liuyang1024.service.LoginService;
import online.liuyang1024.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Create by LiuYang on 2022/5/29 18:04
 */
@RestController
@RequestMapping("/loginController")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public ModelAndView login(User user,ModelAndView modelAndView){
        System.out.println("登陆方法执行啦！");
        User loginUser = loginService.login(user);
        if(loginUser==null){
            modelAndView.addObject("msg","账号或密码错误");
            modelAndView.setViewName("login");
        }else{
            modelAndView.setViewName("index");
        }
        return modelAndView;
    }
    @RequestMapping("/exit")
    public String exit(){
        return null;
    }
}
