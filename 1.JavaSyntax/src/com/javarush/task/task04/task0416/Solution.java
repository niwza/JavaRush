package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        double t = Double.parseDouble(bufferedReader.readLine());

        if (t % 5 < 3)
            System.out.println("зелёный");
        else if (t % 5 < 4)
            System.out.println("желтый");
        else
            System.out.println("красный");
    }
}