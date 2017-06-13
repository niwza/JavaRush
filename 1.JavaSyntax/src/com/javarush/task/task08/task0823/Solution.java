package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] str = s.split("\\s");
        for (String word: str)
            if (word.length() > 1)
                System.out.print(Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ");

        //напишите тут ваш код
    }
}
