package com.javarush.task.task14.task1411;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
//        String key = null;
        List<String> keys = Arrays.asList("user", "loser", "coder", "proger");

        //тут цикл по чтению ключей, пункт 1
        for (String s = reader.readLine(); keys.contains(s); s = reader.readLine())
        {
            //создаем объект, пункт 2
            switch (s) {
                case "user": person = new Person.User();
                    break;
                case "loser": person = new Person.Loser();
                    break;
                case "coder": person = new Person.Coder();
                    break;
                case "proger": person = new Person.Proger();
                    break;
            }


            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
        else if (person instanceof Person.Coder)
            ((Person.Coder) person).coding();
        else if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        else if (person instanceof Person.User)
            ((Person.User) person).live();
    }
}
