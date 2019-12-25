package com.example.demo.controller;


import com.example.demo.pojo.Customer;
import com.example.demo.pojo.UserEntity;

import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Hello {
    @Autowired
    private CustomerService customerService;
    @GetMapping(value = "/hello")
    public String testHello(Model model) {
        // UserEntity userEntity = getCurrentUser(req);
        UserEntity user = new UserEntity();
        user.setLoginName("tom");
        user.setId(234);
        user.setBindType(1);

        model.addAttribute("user", user);

        return "hello";
    }

    @GetMapping(value = "/customer")
    public String testCustomer(Model model) {

        model.addAttribute("list", customerService.selectAll());

        return "customer";
    }
}
