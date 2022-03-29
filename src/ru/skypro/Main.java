package ru.skypro;

import java.awt.desktop.SystemSleepListener;

public class Main {

    public static void main(String[] args) {
short daysWeightLostMin = 7*1000/250;
short daysWeightLostMax = 7*1000/500;
System.out.println("Минимум нужно " + daysWeightLostMax +" дней.");
System.out.println("Максимум нужно " + daysWeightLostMin +" дней.");
int daysWeightLostOverage = (daysWeightLostMin + daysWeightLostMax)/2;
System.out.println("В среднем нужно " + daysWeightLostOverage +" дней.");
    }
}
