package com.example.micro.controller;

import com.example.micro.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroServiceAPI {

    @Autowired
    AddressService service;

    @GetMapping("/hello")
    public String getHello(){
        return service.getIpAddress();
    }
}
