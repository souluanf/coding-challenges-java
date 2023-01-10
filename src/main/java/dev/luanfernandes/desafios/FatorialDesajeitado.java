package dev.luanfernandes.desafios;

import java.util.Scanner;

public class FatorialDesajeitado {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;
        while (n > 0) {
            tmp = tmp * n;
            n--;
            if (n != 0) {
                tmp = tmp / n;
                n--;
            }
            tmp += n;
            n--;
            res += tmp;
            tmp = -n;
            if (n == cnt) {
                res += tmp;
            }
            n--;
        }
        System.out.println(res);
    }
}