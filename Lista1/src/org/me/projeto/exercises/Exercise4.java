package org.me.projeto.exercises;

import org.me.projeto.services.Converter;
import org.me.projeto.utils.Printer;
import org.me.projeto.utils.Reader;

public class Exercise4 {

    public static void main(String[] args) {

        float real;
        float dolar;
        float convertedValue;
        String repeat;

        do {

            Printer.printText("valor da cotação do dolar");
            dolar = Reader.readFloat();

            Printer.printText("valor em reais");
            real = Reader.readFloat();

            convertedValue = Converter.realToDolar(real, dolar);

            Printer.printResultConversion(convertedValue, "dolar");

            Printer.doYouWantToRepeat();
            repeat = Reader.readString2();

            Printer.lineBreak();

        } while (repeat.equals("S"));

    }

}
