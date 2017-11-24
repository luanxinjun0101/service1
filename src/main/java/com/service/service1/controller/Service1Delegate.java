package com.service.service1.controller;

import org.springframework.stereotype.Component;


@Component
public class Service1Delegate implements Service1 {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
