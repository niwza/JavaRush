package com.javarush.task.task17.task1710;

public enum Sex {
    MALE,
    FEMALE;

    public String toString() {
        switch (this) {
            case MALE:
                return "м";
            case FEMALE:
                return "ж";
            default: throw new IllegalArgumentException();
        }
    }
}
