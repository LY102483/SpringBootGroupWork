package online.liuyang1024.dao;

import online.liuyang1024.POJO.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Create by LiuYang on 2022/5/30 02:31
 */

@Mapper
public interface LoginMapper {
    @Select("select u.phoneNum,u.password,u.id,su.userId from sys_user u,sys_user_su su where u.phoneNum=#{phoneNum} and u.password=#{password} and su.userId=u.id limit 1")
    public User login(User user);
}
