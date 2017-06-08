package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        age = 3;
        weight = 4;
        color = "red";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "red";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 4;
        color = "red";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 3;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 4;
    }

    public static void main(String[] args) {

    }
}
