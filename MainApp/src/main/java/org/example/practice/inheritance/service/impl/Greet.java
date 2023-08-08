package org.example.practice.inheritance.service.impl;

import org.example.practice.inheritance.Config;
import org.example.practice.inheritance.service.Greeting;

public class Greet implements Greeting {

    SayHello sayHello = new SayHello();
    SayHola sayHola = new SayHola();

    @Override
    public String simpleGreet() {
        System.out.println("Greet isEnglishActive: "+ isEnglishActive());
        if(isEnglishActive()){
            return sayHello.simpleGreet();
        } else {
            return sayHola.simpleGreet();
        }
    }

    @Override
    public String greetByName(String name) {
        if(isEnglishActive()){
            return sayHello.greetByName(name);
        } else {
            return sayHola.greetByName(name);
        }
    }

    public static boolean isEnglishActive(){
        if("en".equalsIgnoreCase(Config.GLOBAL_LANG)) { return true; }
        return false;
    }
}
