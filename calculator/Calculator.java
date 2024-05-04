package com.vlad.calculator;
import java.util.Scanner;



public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение в формате 'a операция b', где a и b - числа от 1 до 10:");
        String input = sc.nextLine();
        sc.close();
        try {
            System.out.println("Результат: " + calc(input));
        } catch (Exception e) {
            System.out.println("ОШИБКА!!!" + e.getMessage());
        }
    }
    public static String calc(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException();
        }
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String operator = parts[1];
        int result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Такого оператора не существует: " + operator);
        }
        return String.valueOf(result);
    }
}
