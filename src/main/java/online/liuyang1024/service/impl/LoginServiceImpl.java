package online.liuyang1024.service.impl;

import online.liuyang1024.POJO.User;
import online.liuyang1024.dao.LoginMapper;
import online.liuyang1024.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

/**
 * Create by LiuYang on 2022/5/30 02:28
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;

    @Override
    public User login(User user) {
        //获取Dao返回的对象，因为数据可能为空，所以进行捕获
        try {
            User loginUser = loginMapper.login(user);
            return loginUser;
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public void exit() {

    }
}
