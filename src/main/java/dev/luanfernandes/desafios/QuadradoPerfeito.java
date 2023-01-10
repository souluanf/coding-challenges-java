package dev.luanfernandes.desafios;

import java.util.Scanner;

public class QuadradoPerfeito {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int[] d = new int[n + 1];
        for (int i = 0; i < d.length; i++) {
            int quad = i * i;
            if (quad <= n) {
                d[i] = quad;
            } else break;
        }
        int menor = n;
        for (int i = d.length - 1; (i >= 1 && i <= n); i--) {
            if (d[i] > 0) {
                int temp = n;
                int cont = 0;
                for (int j = i; j > 0; j--) {
                    while (temp > 0) {
                        int quad = d[j];
                        if (temp >= quad) {
                            temp = temp - quad;
                            cont = cont + 1;
                        }else break;
                    }
                }
                menor = Math.min(menor, cont);
            }
        }
        System.out.println(menor);
    }
}






