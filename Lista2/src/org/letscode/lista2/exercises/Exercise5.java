package org.letscode.lista2.exercises;

import org.letscode.lista2.Utils.Printer;
import org.letscode.lista2.Utils.Reader;
import org.letscode.lista2.services.HandleWords;

public class Exercise5 {

    public static void main(String[] args) {

        final int QUANTITY_OF_GUESTS = 5;
        String[] guests = new String[QUANTITY_OF_GUESTS];
        String biggestGuestName;

        for (int i = 0; i < guests.length; i++) {
            Printer.enterGuestName(i);
            guests[i] = Reader.readString();
        }

       biggestGuestName = HandleWords.getBiggestWord(guests);

       Printer.showTheGuestBiggestName(biggestGuestName);
    }
}
