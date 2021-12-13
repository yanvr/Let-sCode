package org.me.projeto.exercises;

import org.me.projeto.services.Calculator;
import org.me.projeto.utils.Printer;
import org.me.projeto.utils.Reader;

public class Exercise1 {

    public static void main(String[] args) {

        int number1;
        int number2;
        char option;
        String result;
        String repeat;

        do {

            Printer.printText("número 1");
            number1 = Reader.readInteger();

            Printer.printText("número 2");
            number2 = Reader.readInteger();

            Printer.printMenu();
            option = Reader.readChar();

            switch (option) {
                case '1':
                    result = Calculator.addNumbers(number1, number2);
                    break;
                case '2':
                    result = Calculator.subtractNumbers(number1, number2);
                    break;
                case '3':
                    result = Calculator.multiplyNumbers(number1, number2);
                    break;
                case '4':
                    result = Calculator.divideNumbers(number1, number2);
                    break;
                default:
                    result = "opção inválida";
            }

            Printer.printResultOperation(result);

            Printer.doYouWantToRepeat();
            repeat = Reader.readString2();

            Printer.lineBreak();

        } while (repeat.equals("S"));
    }
}
