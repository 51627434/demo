package com.example.demo.controller;


import com.example.demo.pojo.Channel;
import com.example.demo.pojo.UserEntity;

import com.example.demo.service.ChannelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Hello {
    private static final Logger LOG = LoggerFactory.getLogger(Hello.class);
    @Autowired
    private ChannelService channelService;


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

    @GetMapping(value = "/channel")
    public String testChannel(Model model) {

        model.addAttribute("list", channelService.selectAll());

        LOG.info("channel正在处理...");
        return "channel";
    }
}
