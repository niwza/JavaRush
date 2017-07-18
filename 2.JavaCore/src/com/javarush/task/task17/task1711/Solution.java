package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        String[] params = Arrays.copyOfRange(args, 1, args.length);
        switch (args[0]) {
            case "-d":
                synchronized (allPeople) {
                    for (String id: params) {
                        deletePerson(allPeople.get(Integer.parseInt(id)));
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (String id: params) {
                        printPerson(allPeople.get(Integer.parseInt(id)));
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 0; i < params.length / 4; i++) {
                        String[] values = Arrays.copyOfRange(params, i * 4, (i * 4) + 4);
                        updatePerson(values);
                    }
                }
                break;
            case "-c":
                synchronized (allPeople) {
                    for (int i = 0; i < params.length / 3; i++) {
                        String[] values = Arrays.copyOfRange(params, i * 3, (i * 3) + 3);
                        createPerson(values);
                    }
                }
                break;
//            default:
//                throw new IllegalArgumentException("Invalid option");
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

    public static void createPerson(String[] params) {
        Person p = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = null;
        try {
            date = dateFormat.parse(params[2]);
        } catch (ParseException ex) {
            System.out.println("Illegal Date");
        }
        if (params[1].equals("м"))
            p = Person.createMale(params[0], date);
        else
            p = Person.createFemale(params[0], date);
        allPeople.add(p);
        System.out.println(allPeople.indexOf(p));
    }

    public static void updatePerson(String[] params) {
        int idx = Integer.parseInt(params[0]);
        Person p = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = null;
        try {
            date = dateFormat.parse(params[3]);
        } catch (ParseException ex) {
            System.out.println("Illegal Date");
        }
        if (params[2].equals("м"))
            p = Person.createMale(params[1], date);
        else
            p = Person.createFemale(params[1], date);
        allPeople.set(idx, p);
    }
}
