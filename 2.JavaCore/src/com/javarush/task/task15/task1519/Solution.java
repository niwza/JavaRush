package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.Buffer;

/*
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (String s = br.readLine(); !s.equals("exit"); s = br.readLine()) {
            try {
                short val = Short.parseShort(s);
                if (val > 0 && val < 128)
                    print(val);
                else
                    print((int) val);
            } catch (Exception sh) {
                try {
                    print(Integer.parseInt(s));
                } catch (Exception i) {
                    try {
                        print(Double.parseDouble(s));
                    } catch (Exception d) {
                        print(s);
                    }
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
