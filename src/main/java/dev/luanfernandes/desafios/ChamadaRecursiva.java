package dev.luanfernandes.desafios;

import java.util.Scanner;

public class ChamadaRecursiva {
    public static void main(String[] args) {
        System.out.println(recursive(new Scanner(System.in).nextInt()));
    }

    static int recursive(int numero) {
        return numero == 0 ? 0 : numero + recursive(numero - 1);
    }
}