package com.example.demo.dao;

import com.example.demo.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CustomerDao {

    @Select("SELECT * FROM yjy_customer")
    @Results({
            @Result(property = "customerId", column = "customer_id"),
            @Result(property = "customerCode", column = "customer_code"),
            @Result(property = "customerName", column = "customer_name"),
            @Result(property = "createdTime", column = "created_time"),
            @Result(property = "updatedTime", column = "updated_time"),
    })
    List<Customer> selectAll();
   // List<Customer> selectById(int Id);
}
