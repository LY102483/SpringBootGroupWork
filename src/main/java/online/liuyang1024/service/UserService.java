package online.liuyang1024.service;

import online.liuyang1024.POJO.User;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/30 04:11
 */
public interface UserService {
    //查找所有用户
    public List<User> getAllUser();
    //通过ID删除某个用户
    public void deleteUserById(int id);
    //更新某个用户的数据
    public boolean updateUser(User user);
    //通过手机号码查询某个用户
    public User selectUserByPhone(String phoneNum);
    //添加用户
    public Boolean addUser(User user,int[] roleIds);
}
