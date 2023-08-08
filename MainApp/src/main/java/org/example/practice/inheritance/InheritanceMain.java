package org.example.practice.inheritance;

import org.example.practice.inheritance.service.impl.Greet;
import org.example.practice.inheritance.service.impl.SayHello;

public class InheritanceMain {
    public static void main(String[] args) {
        System.out.println("MAIN starts");
        Long startTime = System.currentTimeMillis();
        Greet greet = new Greet();
        System.out.println(greet.simpleGreet());
        System.out.println(greet.greetByName("Ash"));
        System.out.println("MAIN ends");
        Long endTime = System.currentTimeMillis();
        System.out.println("Time taken: "+ (endTime-startTime) + "ms");
    }

}
