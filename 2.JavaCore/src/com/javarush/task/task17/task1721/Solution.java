package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = null;
        String second = null;
        try {
            first = br.readLine();
            second = br.readLine();
            allLines = Files.readAllLines(Paths.get(first));
            forRemoveLines = Files.readAllLines(Paths.get(second));
        } catch (IOException ioe) {}

        try {
            solution.joinData();
        } catch (CorruptedDataException cd) {}


    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            if (!allLines.isEmpty())
                allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
