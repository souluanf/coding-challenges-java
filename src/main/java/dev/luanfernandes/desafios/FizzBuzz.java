package dev.luanfernandes.desafios;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        String saida;
        if (number % 3 == 0 && number % 5 == 0) {
            saida = "FizzBuzz";
        } else if (number % 3 == 0) {
            saida = "Fizz";
        } else if (number % 5 == 0) {
            saida = "Buzz";
        } else {
            saida = String.valueOf(number);
        }
        System.out.println(saida);
    }
}
