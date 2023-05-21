package org.example.practice.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ComparatorLambda {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));

        Collections.sort(list, (p1,p2) -> {
            return p1.name.compareTo(p2.name);
        });

        //printList(list);
        list.add(new Product(4,"Samsung A5",17000f));
        list.add(new Product(5,"Iphone 6S",65000f));
        list.add(new Product(6,"Sony Xperia",25000f));
        list.add(new Product(7,"Nokia Lumia",15000f));
        list.add(new Product(8,"Redmi 4",26000f));
        list.add(new Product(9,"Lenevo Vibe",19000f));

        Stream<Product> filteredList = list.stream().filter( p -> p.price >= 15_000);

        filteredList.forEach(p -> {
            System.out.println(p.id +" : "+ p.name+" : "+p.price);
        });

        //printList(list);

    }

    private static void printList(List<Product> list) {
        for(Product p: list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
    }
}
