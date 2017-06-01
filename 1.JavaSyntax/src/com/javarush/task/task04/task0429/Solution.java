package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[3];
        nums[0] = Integer.parseInt(br.readLine());
        nums[1] = Integer.parseInt(br.readLine());
        nums[2] = Integer.parseInt(br.readLine());
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        for (int n: nums) {
            if (n > 0)
                positiveNumbers++;
            else if (n < 0)
                negativeNumbers++;
        }
        System.out.println("количество отрицательных чисел: " + negativeNumbers);
        System.out.println("количество положительных чисел: " + positiveNumbers);

    }
}
