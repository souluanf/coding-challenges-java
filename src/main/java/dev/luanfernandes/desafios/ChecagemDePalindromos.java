package dev.luanfernandes.desafios;

import java.util.Scanner;

public class ChecagemDePalindromos {
    public static void main(String[] args) {
        System.out.println(isPalindromo(new Scanner(System.in).nextLine()));
    }

    static String isPalindromo(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            reverse.append(c);
        }
        return str.equals(reverse.toString()) ? "TRUE" : "FALSE";
    }
}
