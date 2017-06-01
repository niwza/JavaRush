package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a > b && a > c)
            if (b > c)
                System.out.println(Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c));
            else
                System.out.println(Integer.toString(a) + " " + Integer.toString(c) + " " + Integer.toString(b));
        if (b > a && b > c)
            if (a > c)
                System.out.println(Integer.toString(b) + " " + Integer.toString(a) + " " + Integer.toString(c));
            else
                System.out.println(Integer.toString(b) + " " + Integer.toString(c) + " " + Integer.toString(a));
        if (c > a && c > b)
            if (a > b)
                System.out.println(Integer.toString(c) + " " + Integer.toString(a) + " " + Integer.toString(b));
            else
                System.out.println(Integer.toString(c) + " " + Integer.toString(b) + " " + Integer.toString(a));
    }
}
