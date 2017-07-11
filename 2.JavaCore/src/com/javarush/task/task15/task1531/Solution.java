package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        return String.valueOf(calculateFactorial(BigInteger.valueOf(n)));


    }

    public static BigInteger calculateFactorial(BigInteger i) {
        if (i.compareTo(BigInteger.valueOf(0)) < 0)
            return BigInteger.valueOf(0);
        else if (i.equals(BigInteger.valueOf(0)))
            return BigInteger.valueOf(1);
        return calculateFactorial(i.subtract(BigInteger.valueOf(1))).multiply(i);
    }

//    public static int calculateFactorial(int i) {
//        if (i < 0)
//            return 0;
//        else if (i == 0)
//            return 1;
//        return calculateFactorial(i - 1) * i;
//    }
}
