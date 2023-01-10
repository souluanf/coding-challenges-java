package dev.luanfernandes.desafios;

import java.util.Scanner;

public class TaxaDeCrescimento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ano = 0;
        while (a < b) {
            a += (a * 0.03);
            b += (b * 0.015);
            ano += 1;
        }
        System.out.printf("O tempo para que o país A tenha a mesma população que o país B será de %d anos.",ano);
    }
}