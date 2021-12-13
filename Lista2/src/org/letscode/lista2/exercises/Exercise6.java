package org.letscode.lista2.exercises;

import org.letscode.lista2.Utils.Printer;
import org.letscode.lista2.Utils.Reader;
import org.letscode.lista2.services.HandleWords;

public class Exercise6 {

    public static void main(String[] args) {

        String word;
        String changedWord;

        Printer.enterWord();
        word = Reader.readString();

        changedWord = HandleWords.changeOddCharacteresToUpperCase(word);

        Printer.showOddCharactersToUpperCase(changedWord);
    }
}
