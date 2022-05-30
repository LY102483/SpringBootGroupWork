package online.liuyang1024.service.impl;

import online.liuyang1024.dao.UserRoleMapper;
import online.liuyang1024.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by LiuYang on 2022/5/30 08:21
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleMapper userRoleMapper;
    @Override
    public void addUserRole(int userId,int[] roleIds) {

        for (int roleId : roleIds) {
            System.out.println("开始向关系表中添加数据");
            userRoleMapper.addUserRole(userId,roleId);
        }
    }

    @Override
    public void deleteUserRoleByUserId(int userid) {
        userRoleMapper.deleteUserRoleByUserId(userid);
    }

    @Override
    public void deleteUserRoleByRoleId(int roloeId) {
        userRoleMapper.deleteUserRoleByRoleId(roloeId);
    }
}
