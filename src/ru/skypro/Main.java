package ru.skypro;

import java.awt.desktop.SystemSleepListener;

public class Main {

    public static void main(String[] args) {
short bananas = 5;
float milk = 200F;
short plombir = 2;
short eggs = 4;
float finalWeight = bananas*80 + milk/100*105 + plombir*100 + eggs*70;
finalWeight/= 1000;
System.out.println("Итоговый вес, кг " + finalWeight);
    }
}
