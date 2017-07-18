package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();

        while (input.available() > 0) {
            int b = input.read();
            set.add(b);
        }

        for (int i: set)
            System.out.print(i + " ");
        input.close();
    }
}
