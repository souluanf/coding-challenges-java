package dev.luanfernandes.desafios;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        int ano = new Scanner(System.in).nextInt();
        String output = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0) ? "Bissexto" : "Nao Bissexto";
        System.out.println(output);
    }
}
