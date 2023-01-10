package dev.luanfernandes.desafios;

import java.util.Scanner;

public class NomeNaVerticalEmEscada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        for (int i = 0; i < entrada.length(); i++) {
            System.out.println(entrada.substring(0, i + 1));
        }
    }
}
