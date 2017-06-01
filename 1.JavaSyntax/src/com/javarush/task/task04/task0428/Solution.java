package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] scores = new int[3];
        scores[0] = Integer.parseInt(br.readLine());
        scores[1] = Integer.parseInt(br.readLine());
        scores[2] = Integer.parseInt(br.readLine());

        int counter = 0;
        for (int n: scores) {
            if (n > 0)
                counter++;
        }
        System.out.println(counter);
    }
}
