package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(br.readLine());
        HashMap<Integer, Integer> values = new HashMap<>();

        while (input.available() > 0) {
            int b = input.read();
            if (values.containsKey(b))
                values.replace(b, values.get(b) + 1);
            else
                values.put(b, 1);
        }

        if (!values.isEmpty()) {
            int minValue = Collections.min(values.values());
            for (Map.Entry<Integer, Integer> m: values.entrySet()) {
                if (m.getValue() == minValue)
                    System.out.print(m.getKey() + " ");
            }
        }
        input.close();
        br.close();
    }
}