package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        int a = scan.nextInt();

        int result;

        System.out.println("-" + "+" + "*" + "/");
        char operator = scan.next().charAt(0);

        System.out.println("Введите 2 число");
        int b = scan.nextInt();

        System.out.println("Ответ: ");
        switch (operator) {
            case '-':
                System.out.println(a - b);
                break;

            case '+':
                System.out.println(a + b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                if(b == 0) {
                    System.out.println("делить на ноль нельзя");
                }else {
                    result = a / b;
                    System.out.println(a / b);
                    break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}