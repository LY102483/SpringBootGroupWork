package online.liuyang1024.service.impl;

import online.liuyang1024.POJO.User;
import online.liuyang1024.dao.RoleMapper;
import online.liuyang1024.dao.UserMapper;
import online.liuyang1024.service.UserRoleService;
import online.liuyang1024.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/30 04:20
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    UserRoleService userRoleService;
    @Override
    public List<User> getAllUser() {
        //获取所有用户
        List<User> allUser = userMapper.getAllUser();
        //查询用户对应职位
        for (User user : allUser) {
            int userId=user.getId();
            user.setRoles(roleMapper.findRoleByUserId(userId));
        }
        return allUser;
    }

    @Override
    public void deleteUserById(int id) {
        userRoleService.deleteUserRoleByUserId(id);
        userMapper.deleteUserById(id);
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public User selectUserByPhone(String phoneNum) {
        return null;
    }

    public Boolean addUser(User user,int[] roleIds){
        boolean flag=true;
        //向sys_user表中添加用户
        userMapper.addUser(user);
        int id=user.getId();//获取新添加用户的主键ID
        userRoleService.addUserRole(id,roleIds);
        return flag;
    }
}
