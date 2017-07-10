package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String aircraft = null;
        try {
            aircraft = br.readLine();
            if (aircraft.equals("helicopter"))
                result = new Helicopter();
            else if (aircraft.equals("plane")) {
                int pass = Integer.parseInt(br.readLine());
                result = new Plane(pass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception s) {
                s.printStackTrace();
            }
        }
    }
}
