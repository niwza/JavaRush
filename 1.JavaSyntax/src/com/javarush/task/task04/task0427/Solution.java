package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String answer = new String();
        int a = Integer.parseInt(bufferedReader.readLine());

        if (a > 0 && a < 1000) {
            if (a % 2 == 0)
                answer += "четное";
            else
                answer += "нечетное";
            if ((a / 100) > 0)
                System.out.println(answer + " трехзначное число");
            else if ((a / 10) > 0)
                System.out.println(answer + " двузначное число");
            else
                System.out.println(answer + " однозначное число");
        }
    }
}
