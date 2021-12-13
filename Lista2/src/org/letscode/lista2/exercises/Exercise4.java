package org.letscode.lista2.exercises;

import org.letscode.lista2.Utils.Printer;
import org.letscode.lista2.Utils.Reader;

public class Exercise4 {

    public static void main(String[] args) {

        final int QUANTITY_OF_NUMBERS = 5;
        int[] numbers = new int[QUANTITY_OF_NUMBERS];

        for (int i = 0; i < numbers.length; i++) {
            Printer.enterNumber(i);
            numbers[i] = Reader.readInteger();
        }

        int higherNumber = numbers[0];
        int smallestNumber = numbers[0];
        int numbersAverage = 0;
        int sumOfNumbers = 0;

        for (int number : numbers) {
            if (number > higherNumber) {
                higherNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            sumOfNumbers += number;
        }

        if (sumOfNumbers > 0) {
            numbersAverage = sumOfNumbers / numbers.length;
        }

        System.out.println("O maior número: " + higherNumber);
        System.out.println("O menor número: " + smallestNumber);
        System.out.println("A média dos número: " + numbersAverage);
    }
}
