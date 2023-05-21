package org.example.practice.lambda.consumer;


import java.util.function.Consumer;

public class AcceptDemo {

    public static void main(String[] args) {

        Consumer<Integer> display = num -> System.out.println("Number accepted: "+num);

        display.accept(10);



    }
}