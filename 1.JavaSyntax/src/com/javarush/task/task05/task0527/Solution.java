package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog spikeDog = new Dog("Spike", 12, 8);
        Cat tomCat = new Cat("Tom", 5, 4);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int weight;

        public Dog(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }

    public static class Cat {
        String name;
        int height;
        int legs;

        public Cat(String name, int height, int legs) {
            this.name = name;
            this.height = height;
            this.legs = legs;
        }
    }

    //напишите тут ваш код
}
