package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        int count = Integer.parseInt(reader.readLine());
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        for (int i: nums) {
            if (i > maximum)
                maximum = i;
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
