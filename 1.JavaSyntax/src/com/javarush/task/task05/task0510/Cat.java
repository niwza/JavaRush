package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name) {
        this.name = name;
        age = 5;
        weight = 2;
        color = "red";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        color = "red";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 2;
        color = "red";
    }

    public void initialize(int weight, String color) {
        age = 2;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        age = 2;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
