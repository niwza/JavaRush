package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fname = br.readLine();
//            Scanner sc = new Scanner(new FileInputStream(fname));
            FileInputStream in = new FileInputStream(fname);
            while (in.available() > 0) {
                System.out.print((char) in.read());
            }
            System.out.println();
            br.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}