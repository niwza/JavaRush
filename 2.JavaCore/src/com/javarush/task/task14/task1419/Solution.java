package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileReader;
import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            int i = Integer.parseInt("f");
        } catch (Exception s) {
            exceptions.add(s);
        }

        try {
            Object s = new Integer(5);
            System.out.println((String) s);
        } catch (Exception d) {
            exceptions.add(d);
        }

        try {
            int[] i = {1};
            i[1] = 2;
        } catch (Exception a) {
            exceptions.add(a);
        }

        try {
            Object o = null;
            o.toString();
        } catch (Exception b) {
            exceptions.add(b);
        }

        try {
            String s = "yeah";
            s.charAt(5);
        } catch (Exception c) {
            exceptions.add(c);
        }

        try {
            File f = new File("file");
            FileReader fr = new FileReader(f);
        } catch (Exception g) {
            exceptions.add(g);
        }

        try {
            int[] i = new int[-1];
        } catch (Exception h) {
            exceptions.add(h);
        }

        try {
            Map<String,String> map = new HashMap<String,String>();
            map.put("a", "a");
            map.put("b", "b");

            for(String key:map.keySet()) {
                map.remove(key);
            }
        } catch (Exception k) {
            exceptions.add(k);
        }

        try {
            Object[] obj = {"string", 1.2f};
            String[] st = Arrays.copyOf(obj, obj.length, String[].class);
        } catch (Exception l) {
            exceptions.add(l);
        }
    }
}
