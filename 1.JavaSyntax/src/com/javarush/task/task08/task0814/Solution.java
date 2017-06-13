package com.javarush.task.task08.task0814;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> ints
                = new HashSet<>(Arrays.asList(11, 10, 2, 45, 32, 3, 4, 40, 9, 8, 23, 12, 13, 5, 6, 14, 15, 16, 17, 18));
        return ints;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
            Integer aValue = it.next();
            if (aValue > 10)
                it.remove();
        }
        return set;

    }

    public static void main(String[] args) {
//        System.out.println(removeAllNumbersMoreThan10(createSet()));

    }
}
