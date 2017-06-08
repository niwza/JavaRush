package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Petya", 22, "London");
        Man man2 = new Man("Vasya", 30, "Moscow");
        Woman woman1 = new Woman("Katya", 19, "Lviv");
        Woman woman2 = new Woman("Lena", 21, "Kiev");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

    }

    //напишите тут ваш код
    public static class Man {
        public String name;
        public int age;
        public String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

//        public Man(String name) {
//            this(name, 20, "hobo");
//        }
//
//        public Man(int age) {
//            this("Ivan", age, "hobo");
//        }
//
//        public Man(String name, int age) {
//            this(name, age, "hobo");
//        }
//
//        public Man(String name, String address) {
//            this(name, 20, address);
//        }
//
//        public Man(int age, String address) {
//            this("Ivan", age, address);
//        }
//
//        public Man() {
//            this("Ivan", 20, "hobo");
//        }
    }

    public static class Woman {
        public String name;
        public int age;
        public String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

//        public Woman(String name) {
//            this(name, 20, "hobo");
//        }
//
//        public Woman(int age) {
//            this("Masha", age, "hobo");
//        }
//
//        public Woman(String name, int age) {
//            this(name, age, "hobo");
//        }
//
//        public Woman(String name, String address) {
//            this(name, 20, address);
//        }
//
//        public Woman(int age, String address) {
//            this("Masha", age, address);
//        }
//
//        public Woman() {
//            this("Masha", 20, "hobo");
//        }
    }
}
