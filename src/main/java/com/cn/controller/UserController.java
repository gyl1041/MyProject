package com.cn.controller;
import com.cn.po.URole;
import com.cn.po.UserT;
import com.cn.service.IRoleService;
import com.cn.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    @Resource
    private IRoleService roleService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        UserT user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }

    @RequestMapping("/role")
    public String show(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        URole user = roleService.getRoleById(userId);
        model.addAttribute("user", user);
        return "Role";
    }

}