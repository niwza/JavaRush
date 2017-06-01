package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == c)
            System.out.println(a);
        else if (b == a)
            System.out.println(b);
        else if (c == b)
            System.out.println(c);
        else if ((a < b && a > c) || (a < c && a > b))
            System.out.println(a);
        else if ((b < c && b > a) || (b < a && b > c))
            System.out.println(b);
        else
            System.out.println(c);
    }
}
