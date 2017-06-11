package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> all = new ArrayList<>();
        ArrayList<Integer> dividableByThree = new ArrayList<>();
        ArrayList<Integer> dividableByTwo = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
            all.add(Integer.parseInt(br.readLine()));

        for (int i: all) {
            if (i % 2 == 0 || i % 3 == 0) {
                if (i % 2 == 0)
                    dividableByTwo.add(i);
                if (i % 3 == 0)
                    dividableByThree.add(i);
            } else {
                other.add(i);
            }
        }

        printList(dividableByThree);
        printList(dividableByTwo);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i: list)
            System.out.println(i);
    }
}
