package com.javarush.task.task14.task1408;

/**
 * Created by niwza on 09.07.2017.
 */
public class UkrainianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE +
                ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}