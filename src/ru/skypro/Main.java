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
    }
}
