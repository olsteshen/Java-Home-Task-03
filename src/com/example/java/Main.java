package com.example.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number:");
        String input1 = scanner.nextLine();
        double value1 = Double.parseDouble(input1);

        System.out.print("Input second number:");
        String input2 = scanner.nextLine();
        double value2 = Double.parseDouble(input2);

        double res1 = addValues(value1, value2);
        double res2 = subtractValues(value1, value2);
        double res3 = multiplyValues(value1, value2);
        double res4 = remainderValues(value1, value2);
        double res5 = modValues(value1, value2);

        NumberFormat intFormat = NumberFormat.getIntegerInstance();

        System.out.println("125 + 24 = " + intFormat.format(res1));
        System.out.println("125 - 24 = " + intFormat.format(res2));
        System.out.println("125 * 24 = " + intFormat.format(res3));
        System.out.println("125 / 24 = " + intFormat.format(res4));
        System.out.println("125 mod 24 = " + intFormat.format(res5));
    }

    public static double addValues(double value1, double value2) {
        return value1 + value2;
    }

    public static double subtractValues(double value1, double value2) {
        return value1 - value2;
    }

    public static double multiplyValues(double value1, double value2) {
        return value1 * value2;
    }

    public static double remainderValues(double value1, double value2) {
        return value1 / value2;
    }

    public static double modValues(double value1, double value2) {
        return value1 % value2;
    }
}

