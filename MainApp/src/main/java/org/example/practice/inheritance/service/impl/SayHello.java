package org.example.practice.inheritance.service.impl;

import org.example.practice.inheritance.service.Greeting;

public class SayHello implements Greeting {

    @Override
    public String simpleGreet() {
        return "Hello";
    }

    @Override
    public String greetByName(String name) {
        return "Hello " + name;
    }

}
