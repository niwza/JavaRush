package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String url = null;
        String obj = null;
        try {
            url = br.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        String[] params = url.split("\\?")[1].split("&");
//        HashMap<String, String> values = new HashMap<>();

        for (String s: params) {
            String[] temp = s.split("=");
            System.out.println(temp[0] + " ");
            if (temp[0].equals("obj") && temp.length > 1)
                obj = temp[1];
        }

        if (obj != null) {
            System.out.println();
            try {
                alert(Double.parseDouble(obj));
            } catch (Exception ex) {
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
