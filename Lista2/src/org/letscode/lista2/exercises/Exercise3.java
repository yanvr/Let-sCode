package org.letscode.lista2.exercises;

import org.letscode.lista2.Utils.Printer;
import org.letscode.lista2.Utils.Reader;
import org.letscode.lista2.services.HandleNumbers;

import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        int QUANTITY_OF_NUMBERS = 5;
        int[] numbers = new int[QUANTITY_OF_NUMBERS];

        for (int i = 0; i < numbers.length; i++) {
            Printer.enterNumber(i);
            numbers[i] = Reader.readInteger();
        }

        List<Integer> ordenedNumbers = HandleNumbers.orderNumbersByOdd(numbers);

        Printer.showNumbers(ordenedNumbers);
    }
}

