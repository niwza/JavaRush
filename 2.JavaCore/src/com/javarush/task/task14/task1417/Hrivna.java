package com.javarush.task.task14.task1417;

/**
 * Created by niwza on 09.07.2017.
 */
public class Hrivna extends Money {
    public String getCurrencyName() {
        return "HRN";
    }

    public Hrivna(double amount) {
        super(amount);
    }
}
