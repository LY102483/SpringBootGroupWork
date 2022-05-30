package online.liuyang1024.controller;

import online.liuyang1024.POJO.User;
import online.liuyang1024.service.RoleService;
import online.liuyang1024.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/29 18:04
 */
@RestController
@RequestMapping("/userController")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;

    @RequestMapping("/deleteUser")
    public ModelAndView deleteUser(int id,ModelAndView modelAndView){
        userService.deleteUserById(id);
        modelAndView.setViewName("redirect:/showPages/showAllUser");
        return modelAndView;
    }
    @RequestMapping("/addUser")
    public ModelAndView addUser(User user,int[] roleIds,ModelAndView modelAndView){
        if(!userService.addUser(user,roleIds)){
            modelAndView.setViewName("redirect:/showPages/showAddUser");
            modelAndView.addObject("msg","添加失败");
        }else{
            modelAndView.setViewName("redirect:/showPages/showAllUser");
        }
        return modelAndView;
    }
}
