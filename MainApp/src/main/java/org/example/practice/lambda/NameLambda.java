package org.example.practice.lambda;

interface Sayable{
    public String say(String name);
}

public class NameLambda {

    public static void main(String[] args) {
        Sayable say1 = (name) -> {
            return "Hello "+name;
        };

        System.out.println(say1.say("Antariksh"));
    }

}
