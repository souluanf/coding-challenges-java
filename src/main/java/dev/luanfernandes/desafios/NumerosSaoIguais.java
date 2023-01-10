package dev.luanfernandes.desafios;

import java.util.Scanner;

public class NumerosSaoIguais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String mensagem = num1 == num2 ? "Sao iguais!" : "Nao sao iguais!";
        System.out.println(mensagem);
    }
}
