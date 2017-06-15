package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private Human mother;
        private Human father;
        private Human children;

        public Human(String name, int age, boolean sex, Human mother, Human father, Human children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
            this.children = children;
        }

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, Human mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
        }

        public Human(String name, int age, boolean sex, Human mother, Human father) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, Human mother, Human father, Human children) {
            this.name = name;
            this.mother = mother;
            this.father = father;
            this.children = children;
        }
    }
}
