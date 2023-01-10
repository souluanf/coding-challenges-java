package dev.luanfernandes.desafios;

import java.util.Scanner;

public class ValidacaoParenteses {
    public static void main(String[] args) {
        System.out.println(isValid(new Scanner(System.in).nextLine()));
    }

    static boolean isValid(String str) {
        String s1 = String.valueOf(str.charAt(0));
        String s2 = String.valueOf(str.charAt(1));
        if (s1.equals("[") && s2.equals("]")) return true;
        return s1.equals("(") && s2.equals(")");
    }
}
