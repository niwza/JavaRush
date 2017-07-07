package com.javarush.task.task13.task1319;


import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String fname = br.readLine();
            bw = new BufferedWriter(new FileWriter(fname));

            for (String s = br.readLine(); !s.equals("exit"); s = br.readLine()) {
                bw.write(s + "\n");
                //bw.newLine();
            }
            bw.write("exit");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
