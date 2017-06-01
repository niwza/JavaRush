package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for (Boolean m = false; !m;) {
            int i = Integer.parseInt(br.readLine());
            sum += i;
            m = i == -1;
        }
        System.out.println(sum);
    }
}
