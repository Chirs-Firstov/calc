package com.company;

import java.util.Scanner;

// calc 1.2
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите знак: ");
        String sing = scanner.next();
        switch (sing) {
            case "+" -> {
                int sum = num1 + num2;
                System.out.println("Сумма = " + sum);
            }
            case "-" -> {
                int sub = num1 - num2;
                System.out.println("Разность = " + sub);
            }
            case "*" ->{
                int mul = num1 * num2;
                System.out.println("Произведение = " + mul);
            }
            case "/" ->{
                int mul = num1 / num2;
                System.out.println("Частное = " + mul);
            }
            default -> System.out.println("Знак не распознан. Используйте пожалуйства только: '+' '-' '*' '/' ");

        }
        scanner.close();
    }
}
