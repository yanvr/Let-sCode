package org.me.projeto.exercises;

import org.me.projeto.services.Calculator;
import org.me.projeto.utils.Printer;
import org.me.projeto.utils.Reader;

public class Exercise2 {

    public static void main(String[] args) {

        final int QUANTITY_NUMBERS = 10;
        int number;
        int[] timesTablesOfNumber;
        String repeat;

        do {

            Printer.printText("valor entre 1 e 10 para exibir sua tabúada");
            number = Reader.readInteger();

            if (number >= 1 && number <= 10) {

                timesTablesOfNumber = Calculator.storageTimesTables(number, QUANTITY_NUMBERS);
                Printer.printTimesTables(number, timesTablesOfNumber);

            } else {
                Printer.invalidOption();
            }

            Printer.doYouWantToRepeat();
            repeat = Reader.readString2();

            Printer.lineBreak();

        } while (repeat.equals("S"));
    }
}
