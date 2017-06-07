package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        double sum = 0;
        for (double i = Double.parseDouble(br.readLine()); i != -1;) {
            count++;
            sum += i;
            i = Double.parseDouble(br.readLine());
        }
        System.out.println(sum/count);
    }
}

