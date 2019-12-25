package com.example.demo.service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

   @Autowired
   private ListCustomer listCustomer;

    public List<Customer> selectAll() {
        System.out.println("进入service");
        System.out.println("customerDao："+listCustomer.toString());
        return listCustomer.selectAll();
    }

}
