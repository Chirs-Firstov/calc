package com.company;

import java.util.Scanner;

// calc 1.0
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        int sum = num1+num2;

        System.out.println("Сумма = " + sum);
        in.close();
    }
}
