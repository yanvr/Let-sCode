package org.me.projeto.utils;

import java.util.Locale;
import java.util.Scanner;

public class Reader {

    static Scanner scanner = new Scanner(System.in);

    public static int readInteger() {
        return scanner.nextInt();
    }

    public static String readString() {
        return scanner.nextLine();
    }

    public static String readString2() {
        return scanner.next().toUpperCase(Locale.ROOT);
    }

    public static char readChar() {
        return scanner.next().charAt(0);
    }

    public static float readFloat() {return scanner.nextFloat(); }

}
