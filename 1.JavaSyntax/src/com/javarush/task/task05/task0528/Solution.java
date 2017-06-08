package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        LocalDate today = LocalDate.now();
        System.out.println(today.getDayOfMonth() + " " + today.getMonthValue() + " " + today.getYear());
    }
}
