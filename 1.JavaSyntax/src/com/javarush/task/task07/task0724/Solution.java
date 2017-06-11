package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1 = new Human("Vasya", true, 60);
        Human babka1 = new Human("Lena", false, 59);
        Human ded2 = new Human("Bill", true, 62);
        Human babka2 = new Human("Mary", false, 63);
        Human father = new Human("Maxim", true, 33, ded1, babka1);
        Human mother = new Human("Lucy", false, 30, ded2, babka2);
        Human son1 = new Human("James", true, 7, father, mother);
        Human son2 = new Human("Kirk", true, 5, father, mother);
        Human daughter = new Human("Linda", false, 4, father, mother);

        System.out.println(ded1);
        System.out.println(babka1);
        System.out.println(ded2);
        System.out.println(babka2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















