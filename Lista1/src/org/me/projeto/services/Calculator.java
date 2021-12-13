package org.me.projeto.services;

public class Calculator {

    public static String addNumbers(int number1, int number2) {
        return String.format("%d", number1 + number2);
    }

    public static String subtractNumbers(int number1, int number2) {
        return String.format("%d", number1 - number2) ;
    }

    public static String multiplyNumbers(int number1, int number2) {
        return String.format("%d", number1 * number2) ;
    }

    public static String divideNumbers(float number1 , float number2) {
        if (number2 > 0) {
            return String.format("%.1f", number1 / number2);
        }
        else {
            return "impossível dividir por zero";
        }
    }

    public static int[] storageTimesTables(int number, int quantity) {
        int[] timesTables = new int[quantity];

        for (int i = 0; i < timesTables.length; i++) {
            timesTables[i] = number * (i + 1);
        }
        return timesTables;
    }
}
