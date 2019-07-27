package com.qsmy.mybatis.controller;

import com.qsmy.mybatis.model.Users;
import com.qsmy.mybatis.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author qsmy
 * @date 2019-07-24
 */
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

    @ResponseBody
    @RequestMapping("/addUser")
    public String addUser(Users users) {
        // usersService.addUser(users);
        usersService.addUserAnn(users);
        return "ok";
    }

    @RequestMapping("/allUsers")
    public String findAll(Model model) {
        List<Users> all = usersService.findAll();
        model.addAttribute("list", all);

        return "list";
    }

    @RequestMapping("/testError")
    public void testError() {
        Object ss = null;
        System.out.println(1 / 0);
    }
}
