package com.newproject.demofornewproject;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class PaymentService {

    public void pay()
    {
        System.out.println("Paying");
        System.out.println("once again want to pay");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct called");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Cleaning resources");
    }
}
