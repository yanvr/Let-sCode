package org.me.projeto.utils;

import java.util.Locale;

public class Printer {

    public static void lineBreak() {
        System.out.println();
    }

    public  static void printText(String text) {
        System.out.printf("Digite o %s: ", text);
    }

    public static void printMenu() {
        System.out.println("Selecione a operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão ");
    }

    public static void printResultOperation(String result) {
        System.out.println("O resultado da operação é: " + result);
    }

    public static void printResultConversion(float result, String measure) {
        System.out.printf(Locale.forLanguageTag("US"),"O resultado da conversão para %s foi: %.2f\n",
                measure, result);
    }
    
    public static void invalidOption() {
        System.out.println("Opção inválida");
    }

    public static void doYouWantToRepeat() {
        System.out.print("Você quer repetir novamente: S/N ");
    }

    public static void printTimesTables(int number, int[] timesTables) {
        for (int i = 0; i < timesTables.length; i++) {
            System.out.printf("%d x %d = %d\n", i + 1, number, timesTables[i]);
        }
    }
}
