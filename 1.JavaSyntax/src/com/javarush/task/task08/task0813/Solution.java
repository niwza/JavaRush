package com.javarush.task.task08.task0813;

import java.util.Arrays;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();
        set.addAll(Arrays.asList("Лиза", "Лоза", "Линия", "Литр", "Лилия", "Линк", "Лист", "Ласты", "Луна", "Лужа", "Луг", "Лига", "Локон", "Люди", "Леопард", "Луза", "Лук", "Лунка", "Линь", "Лаз"));
        return set;
    }

    public static void main(String[] args) {

    }
}
