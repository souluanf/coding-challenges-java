package dev.luanfernandes.desafios;

import java.util.Scanner;

import static java.lang.System.*;
public class LojaDeTintas {
    public static void main(String[] args) {
        double litros = new Scanner(in).nextInt() / 6.0;
        int quantidadeLatas =  (int)( litros / 18 ) + ( ( litros  % 18 ) > 0 ? 1 : 0 );
        int quantidadeGaloes =  (int)( litros / 3.6 ) + ( ( litros % 3.6 ) > 0 ? 1 : 0 );
        out.printf("Quantidade(s) de lata(s) de tinta necessaria(s): %d no valor R$ %.1f%n",quantidadeLatas,80.00 * quantidadeLatas);
        out.printf("Quantidade(s) de galao(oes) de tinta necessaria(s): %d no valor R$ %.1f%n",quantidadeGaloes,25.00 * quantidadeGaloes);
    }
}
