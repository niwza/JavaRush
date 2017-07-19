package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileInputStream file1 = new FileInputStream(br.readLine());
            FileOutputStream file2 = new FileOutputStream(br.readLine());
            FileOutputStream file3 = new FileOutputStream(br.readLine());

            int buffLen2 = file1.available() / 2;
            int buffLen1 = file1.available() - buffLen2;

            byte[] buff1 = new byte[buffLen1];
            byte[] buff2 = new byte[buffLen2];

            file1.read(buff1);
            file1.read(buff2);

            file2.write(buff1);
            file3.write(buff2);

            file1.close();
            file2.close();
            file3.close();

        } catch (IOException ioe) {}
    }
}
