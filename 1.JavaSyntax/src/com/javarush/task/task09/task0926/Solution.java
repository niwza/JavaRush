package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> array = new ArrayList<>();
        int[] len = {5, 2, 4, 7, 0};
        for (int i: len)
            array.add(new int[i]);
        for (int[] i: array) {
            for (int j = 0; j < i.length; j++)
                i[j] = j;
        }
        return array;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
