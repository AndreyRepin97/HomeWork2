package ru.skypro;

import java.awt.desktop.SystemSleepListener;

public class Main {

    public static void main(String[] args) {
float firstBoxer = 78.2F;
float secondBoxer = 82.7F;
float boxersWeight = secondBoxer + firstBoxer;
float boxersWeightDifference1 = secondBoxer - firstBoxer;
float boxersWeightDifference2 = secondBoxer%firstBoxer;
        System.out.println("Вес боксеров");
        System.out.println(boxersWeight);
        System.out.println("Разность веса боксеров");
        System.out.println(boxersWeightDifference1);
        System.out.println("Другая разность веса боксеров");
        System.out.println(boxersWeightDifference2);
    }
}
