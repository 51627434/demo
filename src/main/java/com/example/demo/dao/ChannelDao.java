package com.example.demo.dao;

import com.example.demo.pojo.Channel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ChannelDao {
    List<Channel> selectAll();
}
