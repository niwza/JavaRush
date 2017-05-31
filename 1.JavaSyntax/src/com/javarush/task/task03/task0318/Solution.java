package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int age = Integer.parseInt(bufferedReader.readLine());
        String name = bufferedReader.readLine();

        //String age = bufferedReader.readLine();

        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}