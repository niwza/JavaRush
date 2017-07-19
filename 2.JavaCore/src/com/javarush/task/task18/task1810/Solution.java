package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
//            String filename = br.readLine();
            FileInputStream input;
            for (input = new FileInputStream(br.readLine()); input.available() >= 1000;
                 input = new FileInputStream(br.readLine())) {
                input.close();
            }
            input.close();
            throw new DownloadException();

        } catch (IOException ioe) {}

    }

    public static class DownloadException extends Exception {

    }
}
