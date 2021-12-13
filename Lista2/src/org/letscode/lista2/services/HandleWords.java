package org.letscode.lista2.services;

import java.util.Locale;

public class HandleWords {

    static StringBuilder changedWord;

    public static String invertWord(String word) {
        changedWord = new StringBuilder();
        char[] characters = word.toCharArray();

        for (int i = characters.length - 1; i >= 0; i--) {
            changedWord.append(characters[i]);
        }
        return changedWord.toString();
    }

    public static String changeOddCharacteresToUpperCase(String word) {
        changedWord = new StringBuilder();
        char[] characters = word.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (i % 2 == 0) {
                changedWord.append(String.valueOf(characters[i]).toLowerCase(Locale.ROOT));
            }
            else {
                changedWord.append(String.valueOf(characters[i]).toUpperCase(Locale.ROOT));
            }
        }
        return changedWord.toString();
    }

    public static String getBiggestWord(String[] words) {
        String theBiggestWord = "";

        for (String word : words) {
            if (word.length() > theBiggestWord.length()) {
                theBiggestWord = word;
            }
        }
        return theBiggestWord;
    }
}
