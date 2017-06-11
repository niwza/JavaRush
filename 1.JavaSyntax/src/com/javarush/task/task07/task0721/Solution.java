package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(reader.readLine());

        maximum = minimum = nums[0];

        for (int i: nums) {
            if (i > maximum)
                maximum = i;
            if (i < minimum)
                minimum = i;
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
