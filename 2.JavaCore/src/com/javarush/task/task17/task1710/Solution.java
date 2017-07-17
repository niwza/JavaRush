package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        if (args[0].equals("-i")) {
            printPerson(allPeople.get(Integer.parseInt(args[1])));
        } else if (args[0].equals("-d")) {
            deletePerson(allPeople.get(Integer.parseInt(args[1])));
        } else if (args[0].equals("-c")) {
            createPerson(args[1], args[2], args[3]);
        } else if (args[0].equals("-u")) {
            updatePerson(args[1], args[2], args[3], args[4]);
        }
    }

    public static void printPerson(Person p) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyy", Locale.ENGLISH);
        String name = p.getName();
        String bd = dateFormat.format(p.getBirthDay());
        System.out.println(name + " " + p.getSex() + " " + bd);
    }

    public static void deletePerson(Person p) {
        p.setBirthDay(null);
        p.setName(null);
        p.setSex(null);
    }

    public static void createPerson(String name, String sex, String bd) {
        Person p = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = null;
        try {
            date = dateFormat.parse(bd);
        } catch (ParseException ex) {
            System.out.println("Illegal Date");
        }
        if (sex.equals("м"))
            p = Person.createMale(name, date);
        else
            p = Person.createFemale(name, date);
        allPeople.add(p);
        System.out.println(allPeople.indexOf(p));
    }

    public static void updatePerson(String id, String name, String sex, String bd) {
        int idx = Integer.parseInt(id);
        Person p = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = null;
        try {
            date = dateFormat.parse(bd);
        } catch (ParseException ex) {
            System.out.println("Illegal Date");
        }
        if (sex.equals("м"))
            p = Person.createMale(name, date);
        else
            p = Person.createFemale(name, date);
        allPeople.set(idx, p);
    }
}
