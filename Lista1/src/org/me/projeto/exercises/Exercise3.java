package org.me.projeto.exercises;

import org.me.projeto.services.Converter;
import org.me.projeto.utils.Printer;
import org.me.projeto.utils.Reader;

public class Exercise3 {

    public static void main(String[] args) {

        float celsius;
        float result;
        String repeat;

        do {

            Printer.printText("valor em celsius");
            celsius = Reader.readFloat();

            result = Converter.celsiusToFahrenheit(celsius);

            Printer.printResultConversion(result, "Fahrenheit");

            Printer.doYouWantToRepeat();
            repeat = Reader.readString2();

            Printer.lineBreak();

        } while (repeat.equals("S"));

    }

}
