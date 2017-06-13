package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Moore", new Date("NOVEMBER 12 1981"));
        map.put("Davis", new Date("SEPTEMBER 19 1983"));
        map.put("Kubrick", new Date("AUGUST 24 1982"));
        map.put("Jones", new Date("DECEMBER 31 1982"));
        map.put("White", new Date("MAY 8 1982"));
        map.put("Taylor", new Date("APRIL 23 1982"));
        map.put("Harris", new Date("JULY 16 1982"));
        map.put("Lee", new Date("OCTOBER 12 1982"));
        map.put("Reed", new Date("FEBRUARY 4 1981"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        for (Iterator<Date> it = map.values().iterator(); it.hasNext();) {
            Date date = it.next();
            int mon = date.getMonth();
            if (mon == 5 || mon == 6 || mon == 7)
                it.remove();
        }


    }

    public static void main(String[] args) {
//        HashMap map = createMap();
//        removeAllSummerPeople(map);
//        System.out.println(map);
    }
}
