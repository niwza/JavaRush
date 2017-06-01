package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int a = Integer.parseInt(bufferedReader.readLine());
        String answer = new String();

        if (a < 0) {
            answer += "отрицательное ";
            if (a % 2 == 0)
                answer += "четное число";
            else
                answer += "нечетное число";
        } else if (a > 0) {
            answer += "положительное ";
            if (a % 2 == 0)
                answer += "четное число";
            else
                answer += "нечетное число";
        } else
            answer = "ноль";

        System.out.println(answer);

    }
}
