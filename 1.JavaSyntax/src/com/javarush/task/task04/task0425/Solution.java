package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int x = Integer.parseInt(bufferedReader.readLine());
        int y = Integer.parseInt(bufferedReader.readLine());

        if ( x > 0 && y > 0)
            System.out.println(1);
        else if ( x < 0 && y > 0)
            System.out.println(2);
        else if ( x < 0 && y < 0)
            System.out.println(3);
        else
            System.out.println(4);
    }
}
