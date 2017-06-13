package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Smith", 5000);
        map.put("Brown", 800);
        map.put("Davis", 450);
        map.put("Moore", 1200);
        map.put("Jones", 350);
        map.put("White", 490);
        map.put("Taylor", 1500);
        map.put("Harris", 220);
        map.put("Lee", 3200);
        map.put("Reed", 900);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        for (Iterator<Integer> it = map.values().iterator(); it.hasNext();) {
            int i = it.next();
            if (i < 500)
                it.remove();
        }
    }

    public static void main(String[] args) {

    }
}