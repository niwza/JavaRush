package com.javarush.task.task08.task0817;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.*;

/* 
Нам повторы не нужны
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
        map.put("Harris", "Garry");
        map.put("Lee", "Bruce");
        map.put("Reed", "Lou");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<>(map);
        HashSet<String> dups = new HashSet<>();
        for (String last: copy.values()) {
            if (!dups.add(last))
                removeItemFromMapByValue(map, last);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//        removeTheFirstNameDuplicates(map);
//        System.out.println(map);

    }
}
