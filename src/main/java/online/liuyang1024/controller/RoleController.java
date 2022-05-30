package online.liuyang1024.controller;

import online.liuyang1024.POJO.Role;
import online.liuyang1024.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/29 18:04
 */
@RestController
@RequestMapping("/RoleController")
public class RoleController {
    @Autowired
    RoleService roleService;

    @RequestMapping("/getAllRole")
    public ModelAndView getAllRole(ModelAndView modelAndView){
        List<Role> allRole = roleService.getAllRole();
        modelAndView.addObject("allRole",allRole);
        return modelAndView;
    }
}
