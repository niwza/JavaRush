package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] nums = new int[15];
        int even = 0;
        int odd = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(br.readLine());

        for (int i = 0; i < nums.length; i++){
            if (i % 2 == 0)
                even += nums[i];
            else
                odd += nums[i];
        }

        if (even > odd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
