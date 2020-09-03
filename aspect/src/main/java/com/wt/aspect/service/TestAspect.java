package com.wt.aspect.service;

import org.springframework.stereotype.Component;

@Component
public class TestAspect {

    public void say(){
        System.out.println("service.Test");
    }
}
