package org.example.practice.lambda;


import java.util.ArrayList;
import java.util.function.Consumer;

class Lambdas {

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        System.out.println("=========Program Starts========");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(12);
        list.add(20);

        Consumer<Integer> method = (num) -> System.out.println("Number is "+num);
        //list.forEach(method);

        StringFunction exclaim  = str -> str+"!";
        StringFunction question = str -> str+"?";

        formattedString("Hey",exclaim);
        formattedString("How are you",question);






        System.out.println("=========Program Ends==========");
        long endTime = System.currentTimeMillis();
        long timeTaken = (endTime-startTime);
        System.out.println("Time taken: "+timeTaken+" ms or "+(timeTaken/1000)+" seconds");
    }//main ends

    public static void formattedString(String str, StringFunction format){
        System.out.println(format.run(str));
    }
}

interface StringFunction {
    String run(String str);
}