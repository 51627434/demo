package com.example.demo.service;

import com.example.demo.controller.Hello;
import com.example.demo.dao.ChannelDao;
import com.example.demo.pojo.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChannelService {
    private static final Logger LOG = LoggerFactory.getLogger(ChannelService.class);
    @Autowired
    private ChannelDao channelDao;

    public List<Channel> selectAll() {
        System.out.println("进入service");
        System.out.println("channelDao："+channelDao.toString());
        LOG.info("ChannelService正在处理...");
        return channelDao.selectAll();
    }
}
