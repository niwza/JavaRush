package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
//        System.out.println(isDateOdd("JANUARY 1 2000"));
//        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date end = new Date(date);
        Date start = new Date(date);
        start.setMonth(0);
        start.setDate(1);
        start.setHours(0);
        start.setMinutes(0);
        start.setSeconds(0);

        long msDay = 24 * 60 * 60 * 1000;
        long ms = end.getTime() - start.getTime();

//        System.out.println();
//        System.out.println(ms);
//        System.out.println(msDay);
//        System.out.println(ms / msDay);

        int dayCount = (int) (ms/msDay);

        return (dayCount % 2 != 1);

    }
}
