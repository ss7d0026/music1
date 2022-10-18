package com.ylz.controller;


import com.ylz.pojo.Users;
import com.ylz.service.impl.UsersServiceImpl;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author SS7D0026
 * @since 2022-10-14
 */
@RestController
@RequestMapping
public class UsersController {

    @Autowired
    private UsersServiceImpl usersServiceImpl;

    //根据ID查询
    @RequestMapping(value = "/usersSelectById/{id}")
    public String usersSelectById(@PathVariable int id){
        return usersServiceImpl.usersSelectById(id).toString();
    }

    //根据ID删除
    @RequestMapping(value = "/usersDelectById",method = RequestMethod.GET)
    public String usersDeleteById(int id){
        int result = usersServiceImpl.usersDeleteById(id);
        if (result >= 1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    //根据ID修改
    @RequestMapping(value = "/usersUpdateById",method = RequestMethod.GET)
    public String usersUpdateById(Users users){
        int result = usersServiceImpl.usersUpdateById(users);
        if (result >= 1){
            return "更新成功";
        }else {
            return "更新失败";
        }
    }

    //添加用户
    @RequestMapping(value = "/usersInsrt",method = RequestMethod.GET)
    public int usersInsert(Users users){
        return usersServiceImpl.usersInsert(users);
    }

    //查询全部
    @CrossOrigin
    @RequestMapping(value = "/usersSelectFindAll")
    public List<Users> usersList(){
        return usersServiceImpl.usersSelectFindAll();
    }

}

