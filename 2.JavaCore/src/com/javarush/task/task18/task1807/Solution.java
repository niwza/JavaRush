package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input;
        try {
            input = new FileInputStream(br.readLine());

            int count = 0;

            while (input.available() > 0) {
                int b = input.read();
                if (b == (int) ',')
                    count++;
            }

            System.out.println(count);

            input.close();

        } catch (IOException ioe) {}

    }
}
