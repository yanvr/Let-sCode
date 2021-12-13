package org.letscode.lista2.exercises;

import org.letscode.lista2.Utils.Printer;
import org.letscode.lista2.Utils.Reader;
import org.letscode.lista2.services.HandleWords;

public class Exercise2 {

    public static void main(String[] args) {

        String word;
        String invertedWord;

        Printer.enterWord();
        word = Reader.readString();

        invertedWord = HandleWords.invertWord(word);

        Printer.showInvertedWord(invertedWord);
    }

}
