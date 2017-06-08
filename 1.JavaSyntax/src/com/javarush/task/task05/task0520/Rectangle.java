package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


import com.sun.org.apache.regexp.internal.RE;
import org.w3c.dom.css.Rect;

public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int width;
    private int height;

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        height = width;
    }

    public Rectangle(Rectangle other) {
        top = other.top;
        left = other.left;
        width = other.width;
        height = other.height;
    }

    public static void main(String[] args) {

    }
}
