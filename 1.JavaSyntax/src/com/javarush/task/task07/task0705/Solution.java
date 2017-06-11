package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] big = new int[20];
        int[] first = new int[10];
        int[] last = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            big[i] = Integer.parseInt(br.readLine());
            if (i < 10)
                first[i] = big[i];
            else
                last[i - 10] = big[i];
        }

        for (int i: last)
            System.out.println(i);
    }
}
