package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader br = null;
        BufferedReader fr = null;
        ArrayList<Integer> list = new ArrayList<>();

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String fname = br.readLine();
            fr = new BufferedReader(new InputStreamReader(new FileInputStream(fname)));
            for (String s = fr.readLine(); s != null; s = fr.readLine()) {
//                System.out.println(s);
                int i = Integer.parseInt(s);
                if (i % 2 == 0)
                    list.add(i);
            }

            for (int i = 0; i < list.size(); i++) {
                int min = i;
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) < list.get(min))
                        min = j;
                }
                int temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
            }

            for (int i: list)
                System.out.println(i);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
