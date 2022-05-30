package online.liuyang1024.service;

import online.liuyang1024.POJO.User;

/**
 * Create by LiuYang on 2022/5/30 02:27
 */
public interface LoginService {
    public User login(User user);
    public void exit();
}
