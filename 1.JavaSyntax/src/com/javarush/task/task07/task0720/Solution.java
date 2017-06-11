package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int num = Integer.parseInt(reader.readLine());
        int times = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < num; i++)
            list.add(reader.readLine());

        for (int i = 0; i < times; i++)
            list.add(list.remove(0));

        for (String s: list)
            System.out.println(s);
    }
}