package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Smith", "John");
        map.put("Brown", "Mary");
        map.put("Davis", "John");
        map.put("Moore", "Garry");
        map.put("White", "David");
        map.put("White", "Garry");
        map.put("Taylor", "Swift");
        map.put("Harris", "Jack");
        map.put("White", "Bruce");
        map.put("Reed", "Lou");
        return map;

    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
