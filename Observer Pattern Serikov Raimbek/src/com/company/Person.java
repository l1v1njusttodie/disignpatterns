package com.company;

import java.util.List;

public class Person implements Subscriber{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> animes) {
        System.out.println("Hello " + this.name);
        System.out.println("New anime released: ");
        for (String anime: animes) {
            System.out.println(anime);
        }
    }
}
