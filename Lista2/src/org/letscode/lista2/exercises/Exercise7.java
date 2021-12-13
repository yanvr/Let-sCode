package org.letscode.lista2.exercises;

import org.letscode.lista2.Utils.Printer;
import org.letscode.lista2.Utils.Reader;

public class Exercise7 {

    public static void main(String[] args) {

        final int QUANTITY_OF_PERSONS = 5;
        String[] personsName = new String[QUANTITY_OF_PERSONS];
        int [] personsAge = new int[QUANTITY_OF_PERSONS];

        for (int i = 0; i < QUANTITY_OF_PERSONS; i++) {
            Printer.enterPersonName(i);
            personsName[i] = Reader.readString();
            Printer.enterPersonAge(i);
            personsAge[i] = Reader.readInteger();
        }

        int youngerPersonIndex = 0;
        int olderPersonIndex = 0;
        float averageAge = 0f;

        for (int i = 0; i < QUANTITY_OF_PERSONS; i++) {
            if (personsAge[i] > personsAge[olderPersonIndex]) {
                olderPersonIndex = i;
            }

            if (personsAge[i] < personsAge[youngerPersonIndex]) {
                youngerPersonIndex = i;
            }
            averageAge += personsAge[i];
        }

        if (averageAge > 0) {
           averageAge = averageAge / QUANTITY_OF_PERSONS;
        }

        System.out.printf("%nA pessoa mais é velha %s com %d anos",
                personsName[olderPersonIndex], personsAge[olderPersonIndex]);

        System.out.printf("%nA pessoa mais nova é %s com %d anos",
                personsName[youngerPersonIndex], personsAge[youngerPersonIndex]);

        System.out.printf("%nA media de todas as idades é %.1f anos %n", averageAge);

    }
}
