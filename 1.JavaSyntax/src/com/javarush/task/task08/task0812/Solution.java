package com.javarush.task.task08.task0812;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> lst = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
            lst.add(Integer.parseInt(br.readLine()));

        int count = 0;
        int max = 0;
        int prev = lst.get(0);

        for (int i: lst) {
            if (i == prev) {
                count++;
                if (count > max)
                    max = count;
            } else {
                prev = i;
                count = 1;
            }
        }
        System.out.println(max);

    }
}