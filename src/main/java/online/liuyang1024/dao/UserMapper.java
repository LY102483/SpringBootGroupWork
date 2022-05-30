package online.liuyang1024.dao;

import online.liuyang1024.POJO.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/30 04:20
 */
@Mapper
public interface UserMapper {
    @Select("select * from sys_user u,sys_user_su su where su.userId!=u.id")
    public List<User> getAllUser();


    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("insert into sys_user values(null,#{username},#{password},#{email},#{phoneNum},null,null)")
    public int addUser(User user);

    @Delete("delete * from sys_user where id=#{id}")
    public void deleteUserById(int id);
}
