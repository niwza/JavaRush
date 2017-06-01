package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int[] numbers = new int[4];
        numbers[0] = Integer.parseInt(bufferedReader.readLine());
        numbers[1] = Integer.parseInt(bufferedReader.readLine());
        numbers[2] = Integer.parseInt(bufferedReader.readLine());
        numbers[3] = Integer.parseInt(bufferedReader.readLine());

        int maxNumber = numbers[0];
        for (int i: numbers) {
            if (i > maxNumber)
                maxNumber = i;
        }
        System.out.println(maxNumber);
    }
}
