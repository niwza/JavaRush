package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.awt.*;
import java.util.*;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("James", true, 7);
        Human son2 = new Human("Kirk", true, 5);
        Human daughter = new Human("Linda", false, 4);
        Human father = new Human("Maxim", true, 33, new ArrayList<>(Arrays.asList(son1, son2, daughter)));
        Human mother = new Human("Lucy", false, 30, new ArrayList<>(Arrays.asList(son1, son2, daughter)));
        Human ded1 = new Human("Vasya", true, 60, new ArrayList<>(Arrays.asList(father)));
        Human babka1 = new Human("Lena", false, 59, new ArrayList<>(Arrays.asList(father)));
        Human ded2 = new Human("Bill", true, 62, new ArrayList<>(Arrays.asList(mother)));
        Human babka2 = new Human("Mary", false, 63, new ArrayList<>(Arrays.asList(mother)));
        ArrayList<Human> all = new ArrayList<>(Arrays.asList(son1, son2, daughter, father, mother, ded1, ded2, babka1, babka2));
        for (Human h: all)
            System.out.println(h);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this(name, sex, age, new ArrayList<>());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
