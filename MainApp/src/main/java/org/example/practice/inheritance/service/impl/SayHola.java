package org.example.practice.inheritance.service.impl;

import org.example.practice.inheritance.service.Greeting;

public class SayHola implements Greeting {

    @Override
    public String simpleGreet() {
        return "Hola";
    }

    @Override
    public String greetByName(String name) {
        return "Hola "+ name;
    }

}
