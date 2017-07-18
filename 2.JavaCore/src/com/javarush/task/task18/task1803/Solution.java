package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        FileInputStream input = new FileInputStream(filename);
        HashMap<Integer, Integer> values = new HashMap<>();

        while (input.available() > 0) {
            int b = input.read();
            if (values.containsKey(b))
                values.replace(b, values.get(b) + 1);
            else
                values.put(b, 1);
        }

        if (!values.isEmpty()) {
            int maxValue = Collections.max(values.values());
            for (Map.Entry<Integer, Integer> m: values.entrySet()) {
                if (m.getValue() == maxValue)
                    System.out.print(m.getKey() + " ");
            }
        }
        input.close();
        br.close();
    }
}
