package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String filename1 = br.readLine();
            String filename2 = br.readLine();

            FileInputStream file1 = new FileInputStream(filename1);
            FileOutputStream file2 = new FileOutputStream(filename2);

            byte[] contents = new byte[file1.available()];
            byte[] reverseContents = new byte[file1.available()];
            file1.read(contents);

            for (int i = 0; i < contents.length; i++) {
                reverseContents[(contents.length - 1) - i] = contents[i];
            }

            file2.write(reverseContents);

            file1.close();
            file2.close();


        } catch (IOException ioe) {
        }
    }
}
