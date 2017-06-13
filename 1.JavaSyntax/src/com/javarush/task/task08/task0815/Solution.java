package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Smith", "John");
        map.put("Brown", "Mary");
        map.put("Davis", "John");
        map.put("Moore", "Garry");
        map.put("Jones", "David");
        map.put("White", "Garry");
        map.put("Taylor", "Swift");
        map.put("Harris", "Jack");
        map.put("Lee", "Bruce");
        map.put("Reed", "Lou");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String first: map.values()) {
            if (name.equals(first))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (String last: map.keySet()) {
            if (last.equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
