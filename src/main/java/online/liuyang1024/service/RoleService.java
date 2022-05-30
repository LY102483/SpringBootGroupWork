package online.liuyang1024.service;

import online.liuyang1024.POJO.Role;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/30 05:09
 */

public interface RoleService {
    //通过UserID查询对应的职位
    public List<Role> findRoleByUserId(int id);
    //获取所有职位
    public List<Role> getAllRole();
}
