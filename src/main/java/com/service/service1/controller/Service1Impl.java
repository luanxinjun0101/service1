package com.service.service1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-11-24T02:35:34.317Z")

@RpcSchema(schemaId = "service1")
public class Service1Impl implements Service1{

    @Autowired
    private Service1Delegate service1Delegate;


    public String helloworld(String name) {

        return service1Delegate.helloworld(name);
    }

}
