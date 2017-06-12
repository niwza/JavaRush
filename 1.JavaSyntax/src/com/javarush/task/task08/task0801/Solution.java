package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> plants = new HashSet<>();
        Collections.addAll(plants, "арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель");

        for (String s: plants)
            System.out.println(s);

    }
}
