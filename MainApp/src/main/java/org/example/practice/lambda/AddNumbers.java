package org.example.practice.lambda;

@FunctionalInterface
interface Addable{
    int add(int num1, int num2);
}

public class AddNumbers {

    public static void main(String[] args) {

        Addable add1 = (num1, num2) -> {
            System.out.println("Sum of "+num1+" and "+num2+ " is:");
            return num1 + num2 ;
        };

        System.out.println(add1.add(4,5));

    }

}
