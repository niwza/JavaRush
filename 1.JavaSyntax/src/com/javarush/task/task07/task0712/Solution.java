package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
            str.add(br.readLine());

        int max, min, pos_min, pos_max;
        pos_min = pos_max = 0;
        min = max = str.get(0).length();

        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() > max) {
                max = str.get(i).length();
                pos_max = i;
            }
            if (str.get(i).length() < min) {
                min = str.get(i).length();
                pos_min = i;
            }
        }

        int pos = (pos_max < pos_min) ? pos_max : pos_min;

        System.out.println(str.get(pos));
    }
}
