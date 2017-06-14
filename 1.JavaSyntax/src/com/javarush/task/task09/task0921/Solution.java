package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ints = new ArrayList<>();
        try {

            for (int i = Integer.parseInt(br.readLine());;i = Integer.parseInt(br.readLine())) {
                ints.add(i);
            }
        } catch (Exception e) {
            for (int i: ints)
                System.out.println(i);
        }
    }
}
