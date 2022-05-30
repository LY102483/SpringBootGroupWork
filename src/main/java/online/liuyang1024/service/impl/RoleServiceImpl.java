package online.liuyang1024.service.impl;

import online.liuyang1024.POJO.Role;
import online.liuyang1024.dao.RoleMapper;
import online.liuyang1024.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/30 05:10
 */
@Service
public class RoleServiceImpl implements RoleService {
@Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> findRoleByUserId(int id) {
        return null;
    }

    @Override
    public List<Role> getAllRole() {
        return roleMapper.getAllRole();
    }


}
