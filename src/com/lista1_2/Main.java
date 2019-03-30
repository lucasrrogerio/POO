package com.lista1_2;

public class Main {

    private static void primos(long x) {
        boolean primo = true;
        for (int i = 2; i <= x/2; i++) {
            if (x%i==0) {
                System.out.print(i + " ");
                primo = false;
            }
        }
        if (primo) {
            System.out.println("O número " + x + " é primo!");
        }
    }

    public static void main(String[] args) {
        primos(29);
    }
}
