package org.letscode.lista2.Utils;

import java.util.List;

public class Printer {

    public static void enterFruitName (int index) {
        System.out.printf("Digite o nome da fruta %d: ", index + 1);
    }

    public static void enterWord() {
        System.out.print("Digite uma palavra: ");
    }

    public static void enterNumber (int index) {
        System.out.printf("Digite o número %d: ", index + 1);
    }

    public static void enterGuestName(int index) {
        System.out.printf("Informe o nome do convidade %d: ", index + 1);
    }

    public static void enterPersonName(int index) {
        System.out.printf("Informe o nome da pessoa %d: ",
                index + 1);
    }

    public static void enterPersonAge(int index) {
        System.out.printf("Informe a idade da pessoa %d: ", index + 1);
    }

    public static void enterPersonWeight(int index) {
        System.out.printf("Informe o peso da pessoa %d: ",
                index + 1);
    }

    public static void enterPersonHeight(int index) {
        System.out.printf("Informe a altura da pessoa %d: ", index + 1);
    }

    public static void shoppingCartMessage() {
        System.out.println("\n** CARRINHO DE COMPRAS **");
    }

    public static void showInvertedWord(String invertedWord) {
        System.out.printf("\nO inverso da palavra inserida é %s\n",
                invertedWord);
    }

    public static void showOddCharactersToUpperCase(String changedWord) {
        System.out.println("\nA palavra inserida com os caracteres no indice impar para o maiusculo ficou : "
                + changedWord);
    }

    public static void showTheGuestBiggestName(String guest) {
        System.out.printf("%nO convidado com o nome mais longo é %s com %d letras %n",
                guest, guest.replace(" ", "").length());
    }

    public static void showNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
