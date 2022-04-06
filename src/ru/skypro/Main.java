package ru.skypro;

import java.awt.desktop.SystemSleepListener;

public class Main {

    public static void main(String[] args) {
int MariaSalary =67_760;
int KristinaSalary =83_690;
int DenisSalary =76_230;

int MariaFinalSalary = MariaSalary/100*10 + MariaSalary;
int DenisFinalSalary = DenisSalary/100*10 + DenisSalary;
int KristinaFinalSalary = KristinaSalary/100*10 + KristinaSalary;

int MariaYearSalaryDif = MariaFinalSalary*12 - MariaSalary*12;
int DenisYearSalaryDif = DenisFinalSalary*12 - DenisSalary*12;
int KristinaYearSalaryDif = KristinaFinalSalary*12 - KristinaSalary*12;

System.out.println("Маша теперь получает " + MariaFinalSalary + " рублей. Годовой доход вырос на " + MariaYearSalaryDif + " рублей.");
System.out.println("Денис теперь получает " + DenisFinalSalary + " рублей. Годовой доход вырос на " + DenisYearSalaryDif + " рублей.");
System.out.println("Кристина теперь получает " + KristinaFinalSalary + " рублей. Годовой доход вырос на " + KristinaYearSalaryDif + " рублей.");

        //task3
        System.out.println("task3 ");
        double a = 256;
        double b = a / 100;
        b = (int) b;
        b = a - b * 100;
        b = b / 10;
        b = (int) b;
        System.out.println(b);


        //task2
        System.out.println("task2 ");
        int x = 5;
        int y = 7;
        System.out.println("x "+x);
        System.out.println("y "+y);
        x = x * y;
        y = x/y;
        x = x/y;
        System.out.println("x "+x);
        System.out.println("y "+y);

        //task1
        System.out.println("task1 ");
        int A = 12;
        int B = 27;
        int C = 44;
        int D = 15;
        int e = 9;
        int result = A*(B+(C-D*e));
        System.out.println("Результат " + result);
        result = result - result*2;
        System.out.println("Инвертируем 1 раз " + result);
        result = result - result*2;
        System.out.println("Инвертируем 2 раз " + result);
    }
}
