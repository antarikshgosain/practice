package org.example.practice.lambda;

@FunctionalInterface
interface CarInterface{

    void run();

    default void def1() {
        System.out.println("Default 1 called");
    }
    default void def2() {
        System.out.println("Default 2 called");
    }
    static  void fun1() {}
    static  void fun2() {}


}