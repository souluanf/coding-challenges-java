package dev.luanfernandes.desafios;

import java.util.Scanner;

public class TempoDeDownload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tmhMB = sc.nextFloat();
        double tmhMbps = sc.nextFloat();
        System.out.printf("%.2f",(tmhMB/tmhMbps)/60);
    }
}
