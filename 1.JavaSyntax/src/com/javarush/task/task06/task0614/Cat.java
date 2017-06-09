package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
//        Cat.cats.add(this);
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat[] allCats = new Cat[10];
        for (int i = 0; i < 10; i++) {
            allCats[i] = new Cat();
            Cat.cats.add(allCats[i]);
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (Cat c: Cat.cats)
            System.out.println(c);
    }
}
