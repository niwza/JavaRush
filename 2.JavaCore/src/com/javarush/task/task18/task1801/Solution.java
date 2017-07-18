package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        FileInputStream input = new FileInputStream(filename);
        int max = Integer.MIN_VALUE;
        while (input.available() > 0) {
            int b = input.read();
            if (b > max)
                max = b;
        }

        System.out.println(max);
        input.close();
    }
}
