package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import javax.sound.midi.Soundbank;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int[] numbers = new int[3];

        numbers[0] = Integer.parseInt(bufferedReader.readLine());
        numbers[1] = Integer.parseInt(bufferedReader.readLine());
        numbers[2] = Integer.parseInt(bufferedReader.readLine());

        if ((numbers[0] == numbers[1]) && (numbers[2] != numbers[0]))
            System.out.println(3);
        else if ((numbers[0] == numbers[2]) && (numbers[1] != numbers[0]))
            System.out.println(2);
        else if ((numbers[1] == numbers[2]) && (numbers[0] != numbers[1]))
            System.out.println(1);
    }
}