package com.tan.controller;

import com.tan.model.TanUser;
import com.tan.service.TanUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value="/user")
public class TanUserController {
    @Resource
    private TanUserService tanUserService;

    @GetMapping(value = "/findAll")
    public String findAll(Model model){
        List<TanUser> tanUserList = tanUserService.findAll();
        for(TanUser tanUser : tanUserList){
            System.out.println("id:"+tanUser.getId());
            System.out.println("name:"+tanUser.getName());

        }
        return "hello";
    }
}
