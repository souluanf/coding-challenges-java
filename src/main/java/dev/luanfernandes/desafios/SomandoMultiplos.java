package dev.luanfernandes.desafios;

import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initial = scanner.nextInt();
        int last = scanner.nextInt();
        int soma = 0;
        for (int i = initial; i <= last; i++) {
            if (i % initial == 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
