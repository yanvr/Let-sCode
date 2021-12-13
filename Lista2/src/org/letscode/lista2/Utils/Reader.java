package org.letscode.lista2.Utils;

import java.util.Scanner;

public class Reader {

    static Scanner scanner;

    public static void clearScanner() {
        scanner.close();
    }

     public static String readString() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int readInteger() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static float readFloat() {
        scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

}
