package org.example.practice.lambda;

interface Salty{
    String addSalt();
}

public class BurgerLambda {

    public static void main(String[] args) {
        Salty salty = () -> {
            return "Adding medium salt";
        };
        System.out.println(salty.addSalt());
    }

}
