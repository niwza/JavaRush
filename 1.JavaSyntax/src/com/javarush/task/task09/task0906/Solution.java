package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String method = stack[2].getMethodName();
        String cls = stack[2].getClassName();
        System.out.println(cls + ": " + method + ": " + s);
    }
}
