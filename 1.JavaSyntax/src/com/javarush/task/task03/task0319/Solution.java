package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        int salary = Integer.parseInt(bufferedReader.readLine());
        int years = Integer.parseInt(bufferedReader.readLine());

        System.out.println(name + " получает " + salary + " через " + years + " лет.");
    }
}
