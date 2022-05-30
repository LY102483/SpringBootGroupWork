package online.liuyang1024.controller;

import online.liuyang1024.POJO.User;
import online.liuyang1024.service.RoleService;
import online.liuyang1024.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/29 23:31
 */
@Controller
@RequestMapping("/showPages")
public class ShowPages {

    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @RequestMapping("/showLogin")
    public String showLogin(){
        return "login";
    }

    @RequestMapping("/showIndex")
    public String showIndex(){
        return "index";
    }
    @RequestMapping("/showAddUser")
    public ModelAndView showAddUser(ModelAndView modelAndView){
        modelAndView.setViewName("/pages/user-add");
        modelAndView.addObject("allRole",roleService.getAllRole());
        return modelAndView;
    }

    @RequestMapping("/showAllUser")
    public ModelAndView showAllUser(ModelAndView modelAndView){
        System.out.println("进入查询所有用户的方法啦！");
        modelAndView.setViewName("/pages/user-list");
        List<User> allUser = userService.getAllUser();
        modelAndView.addObject("allUser",allUser);
        return modelAndView;
    }

}
