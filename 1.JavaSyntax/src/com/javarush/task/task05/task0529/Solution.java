package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String in = br.readLine();

        while (! in.equals("сумма")) {
            sum += Integer.parseInt(in);
            in = br.readLine();
        }
//        for (String i = br.readLine();! i.equals("сумма");) {
//            sum += Integer.parseInt(i);
//        }

        System.out.println(sum);
    }
}
