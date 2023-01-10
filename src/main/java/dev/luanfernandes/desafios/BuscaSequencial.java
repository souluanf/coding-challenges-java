package dev.luanfernandes.desafios;

import java.util.*;


public class BuscaSequencial {
    public static void main(String[] args) {
        int entrada = new Scanner(System.in).nextInt();
        int index = Arrays.asList(64, 137, -16, 43, 67, 81, -90, 212, 10, 75).indexOf(entrada);
        String saida = index != -1? String.format("Achei %d na posicao %d", entrada, index): String.format("Numero %d nao encontrado! ",entrada);
        System.out.println(saida);
    }
}
