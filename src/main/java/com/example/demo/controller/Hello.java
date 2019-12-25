package com.example.demo.controller;

import com.example.demo.dao.CustomerDao;
import com.example.demo.pojo.Customer;
import com.example.demo.pojo.UserEntity;
import com.example.demo.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class Hello {
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
        // UserEntity userEntity = getCurrentUser(req);
        CustomerService customerService = new CustomerService();
        List<Customer> list =  customerService.selectAll();


        System.out.println(list.size());

        model.addAttribute("list", list);

        return "customer";
    }
}
