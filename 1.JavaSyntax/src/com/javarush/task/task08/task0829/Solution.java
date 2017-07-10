package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
//        List<String> addresses = new ArrayList<String>();
        HashMap<String, String> addresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            addresses.put(city, family);
        }

        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());
        String cityName = reader.readLine();

        if (addresses.containsKey(cityName)) {
            String familySecondName = addresses.get(cityName);
            System.out.println(familySecondName);
        }
    }
}
