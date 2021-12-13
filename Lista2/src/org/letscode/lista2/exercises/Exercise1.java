package org.letscode.lista2.exercises;

import org.letscode.lista2.Utils.Printer;
import org.letscode.lista2.Utils.Reader;

public class Exercise1 {

    public static void main(String[] args) {

        final int QUANTITY_OF_FRUITS = 5;
        String[] fruits = new String[QUANTITY_OF_FRUITS];

        for (int i = 0; i < fruits.length; i++) {
            Printer.enterFruitName(i);
            fruits[i] = Reader.readString();
        }

        Printer.shoppingCartMessage();

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
