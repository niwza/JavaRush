package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());

    }



    public static void main(String[] args) {
    }

    public static class Thread1 extends Thread {
        public void run() {
            while (true) {}
        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        public void showWarning() {
            if (this.isAlive())
                this.interrupt();
        }
    }

    public static class Thread5 extends Thread {
        private int count;

        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                for (String s = reader.readLine(); !s.equals("N"); s = reader.readLine()) {
                    count += Integer.parseInt(s);
                }
                System.out.println(count);
            } catch (Exception e) {}
        }
    }
}