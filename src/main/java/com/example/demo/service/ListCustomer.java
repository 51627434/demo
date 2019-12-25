package com.example.demo.service;

import com.example.demo.pojo.Customer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ListCustomer {
    List<Customer> list;
    public List<Customer> selectAll(){

        list = new ArrayList<Customer>();
        Customer c = new Customer();
        c.setCustomerCode("0001");
        c.setCustomerName("yjy01");
        list.add(c);

         c = new Customer();
        c.setCustomerCode("00023");
        c.setCustomerName("yjy023");
        list.add(c);


        return  list;
    }
}
