package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    private static class Dog implements Eat, Movable {
        public void eat() {}
        public void move() {}
    }

    private static class Mouse implements Movable, Eatable {
        public void eaten() {}
        public void move() {}
    }

    private static class Cat implements Movable, Eat, Eatable {
        public void eat() {}
        public void eaten() {}
        public void move() {}
    }
}