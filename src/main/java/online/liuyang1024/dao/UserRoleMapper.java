package online.liuyang1024.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Create by LiuYang on 2022/5/30 08:23
 */
@Mapper
public interface UserRoleMapper {
    @Insert("insert into sys_user_role values(null,#{userId},#{roleId})")
    public void addUserRole(int userId,int roleId);

    @Delete( "delete * from where userId = #{userId}")
    public void deleteUserRoleByUserId(int userId);

    @Delete( "delete * from where  roleId= #{roleId}")
    public void deleteUserRoleByRoleId(int roloeId);
}
