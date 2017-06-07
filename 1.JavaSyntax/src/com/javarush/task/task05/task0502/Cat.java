package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        return this.weight * this.strength * this.age > anotherCat.weight * anotherCat.strength * anotherCat.age;
        //напишите тут ваш код
    }

    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//
//        cat1.age = 10;
//        cat1.name = "a";
//        cat1.strength = 10;
//        cat1.weight = 21;
//
//        cat2.age = 5;
//        cat2.name = "a";
//        cat2.strength = 10;
//        cat2.weight = 13;
//
//        System.out.println(cat1.fight(cat2));
//        System.out.println(cat2.fight(cat1));
    }
}
