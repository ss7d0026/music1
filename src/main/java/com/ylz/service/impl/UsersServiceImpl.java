package com.ylz.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.pojo.Users;
import com.ylz.mapper.UsersMapper;
import com.ylz.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author SS7D0026
 * @since 2022-10-14
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    //根据ID查
    public Users usersSelectById(int id){
        return usersMapper.selectById(id);
    }

    //根据ID删除
    public int usersDeleteById(int id){
        return usersMapper.deleteById(id);
    }

    //修改用户信息
    public int usersUpdateById(Users users){
        return usersMapper.updateById(users);
    }

    //添加用户信息
    public int usersInsert(Users users){
        return usersMapper.insert(users);
    }

    //查询全部用户信息
    public List<Users> usersSelectFindAll(){
        return usersMapper.selectList(null);
    }

}
