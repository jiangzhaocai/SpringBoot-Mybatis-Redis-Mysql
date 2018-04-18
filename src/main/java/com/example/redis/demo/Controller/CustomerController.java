package com.example.redis.demo.Controller;

import com.example.redis.demo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin2.message.Message;

import java.io.IOException;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() throws IOException {
        customerService.saveCustomers();
        customerService.fetchAllCustomers();
        customerService.fetchIndividualCustomers();
        return "ok";
    }
}
