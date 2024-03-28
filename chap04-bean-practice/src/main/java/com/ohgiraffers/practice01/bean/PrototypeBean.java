package com.ohgiraffers.practice01.bean;

import org.springframework.context.annotation.Configuration;


public class PrototypeBean {

    private String message;

    public PrototypeBean(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
