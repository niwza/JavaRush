package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

//    public static ArrayList<String> fix(ArrayList<String> list) {
//        //напишите тут ваш код
//        ArrayList<String> result = new ArrayList<>();
//        for (String s: list) {
//            if (s.contains("р") || s.contains("л")) {
//                if (s.contains("р") && !s.contains("л")) {
//                } else if (s.contains("л") && !s.contains("р")) {
//                    result.add(s);
//                    result.add(s);
//                } else {
//                    result.add(s);
//                }
//            } else {
//                result.add(s);
//            }
//        }
//        return result;
//    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).contains("р") && !list.get(i).contains("л"))
                list.remove(list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).contains("л") && !list.get(i).contains("р"))
                list.add(i + 1, list.get(i));
        }
        return list;
    }
}