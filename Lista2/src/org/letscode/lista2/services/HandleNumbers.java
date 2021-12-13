package org.letscode.lista2.services;

import java.util.ArrayList;
import java.util.List;

public class HandleNumbers {

    public static List<Integer> orderNumbersByOdd(int[] numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
            else {
                oddNumbers.add(number);
            }
        }
        List<Integer> array = new ArrayList<>();
        array.addAll(oddNumbers);
        array.addAll(evenNumbers);

        return array;
    }
}
