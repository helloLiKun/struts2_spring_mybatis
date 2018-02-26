package com.struts.cn.action;

import com.struts.cn.entity.User;
import com.struts.cn.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by likun on 2018/2/26 0026.
 */
@Controller
@Scope("prototype")
public class UserAction {
    public String execute(){
        List<User> list=userService.getUsers();
        System.out.println("---------------"+list.size());
        return "success";
    }

    @Resource
    UserService userService;
}
