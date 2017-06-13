package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        int min = array.get(0);
        for (int i: array) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int colNum = Integer.parseInt(br.readLine());
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < colNum; i++)
            ints.add(Integer.parseInt(br.readLine()));
        return ints;
    }
}
