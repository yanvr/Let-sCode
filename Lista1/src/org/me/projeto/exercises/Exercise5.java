package org.me.projeto.exercises;

import org.me.projeto.services.Converter;
import org.me.projeto.utils.Printer;
import org.me.projeto.utils.Reader;

public class Exercise5 {

    public static void main(String[] args) {

        float inch;
        float convertedMeasure;
        String repeat;

        do {

            Printer.printText("valor em polegadas");
            inch = Reader.readFloat();

            convertedMeasure = Converter.inchToCentimeter(inch);

            Printer.printResultConversion(convertedMeasure, "centímetros");

            Printer.doYouWantToRepeat();
            repeat = Reader.readString2();

            Printer.lineBreak();

        } while (repeat.equals("S"));
    }
}
