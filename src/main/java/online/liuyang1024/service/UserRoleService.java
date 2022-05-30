package online.liuyang1024.service;

/**
 * Create by LiuYang on 2022/5/30 08:15
 */
public interface UserRoleService {
    //增加关系
    public void addUserRole(int userid,int[] roleIds);


    //删除关系
    // 通过userID删除
    public void deleteUserRoleByUserId(int userid);

    // 通过roleId删除
    public void deleteUserRoleByRoleId(int roloeId);
}
