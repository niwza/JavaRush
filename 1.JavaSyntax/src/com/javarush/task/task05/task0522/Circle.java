package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle() {
        x = 1;
        y = 2;
        radius = 20;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x) {
        this(x, 2, 3);
    }

    public Circle(double x, double y) {
        this(x, y, 20);
    }

    public static void main(String[] args) {

    }
}