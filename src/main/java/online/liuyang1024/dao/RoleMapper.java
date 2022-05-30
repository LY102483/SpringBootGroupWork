package online.liuyang1024.dao;

import online.liuyang1024.POJO.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/30 05:09
 */
@Mapper
public interface RoleMapper {
    @Select("select * from sys_user_role ur,sys_role r where ur.userId=#{userId} and ur.roleId=r.id")
    public List<Role> findRoleByUserId(int userId);

    @Select("select * from sys_role")
    public List<Role> getAllRole();
}
