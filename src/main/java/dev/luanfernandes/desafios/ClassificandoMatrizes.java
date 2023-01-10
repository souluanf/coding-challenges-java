package dev.luanfernandes.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class ClassificandoMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (nums[i] % 2 != 0) {
                for (int j = (i + 1); j < N; j++) {
                    if (nums[j] % 2 == 0) {
                        int impar = nums[i];
                        int par = nums[j];
                        nums[i] = par;
                        nums[j] = impar;
                        break;
                    }
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}