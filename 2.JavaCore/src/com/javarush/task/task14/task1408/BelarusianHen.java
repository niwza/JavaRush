package com.javarush.task.task14.task1408;

/**
 * Created by niwza on 09.07.2017.
 */
public class BelarusianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 25;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS +
                ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
