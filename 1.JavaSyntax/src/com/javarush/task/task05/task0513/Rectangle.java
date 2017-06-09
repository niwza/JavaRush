package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        height = 0;
        width = 0;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        height = width;
        this.width = width;
    }

    public void initialize(Rectangle other) {
        this.top = other.top;
        this.left = other.left;
        this.height = other.height;
        this.width = other.width;
    }

    public static void main(String[] args) {

    }
}
