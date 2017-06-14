package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<>();
        for (int i = 0; i < 10; i++)
            cats.put("Cat" + i, new Cat("Cat" + i));
//        Cat cat1 = new Cat("Vaska");
//        Cat cat2 = new Cat("Bob");
//        Cat cat3 = new Cat("Jason");
//        Cat cat4 = new Cat("Karl");
//        Cat cat5 = new Cat("Jim");
//        Cat cat6 = new Cat("Kirk");
//        Cat cat7 = new Cat("Max");
//        Cat cat8 = new Cat("Mike");
//        Cat cat9 = new Cat("Lora");
//        Cat cat10 = new Cat("July");
//
//        cats.put(cat1.name, cat1);
//        cats.put(cat2.name, cat2);
//        cats.put(cat3.name, cat3);
//        cats.put(cat4.name, cat4);
//        cats.put(cat5.name, cat5);
//        cats.put(cat6.name, cat6);
//        cats.put(cat7.name, cat7);
//        cats.put(cat8.name, cat8);
//        cats.put(cat9.name, cat9);
//        cats.put(cat10.name, cat10);
//
//        cats.put("Jim", new Cat("Jim"));
//        cats.put("Jason", new Cat("Jason"));
//        cats.put("Karl", new Cat("Karl"));
//        cats.put("Bob", new Cat("Bob"));
//        cats.put("Kirk", new Cat("Kirk"));
//        cats.put("Max", new Cat("Max"));
//        cats.put("Mike", new Cat("Mike"));
//        cats.put("Lora", new Cat("Lora"));
//        cats.put("July", new Cat("July"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> set = new HashSet<Cat>(map.values());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
