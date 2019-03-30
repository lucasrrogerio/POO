package com.lista1_1;

public class Main {

    private static void imprimeNumeros() {
        for (int i = 150; i < 301; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void imprimeSoma() {
        int soma = 0;
        for (int i = 1; i < 1001; i++) {
            soma += i;
        }
        System.out.println(soma);
    }

    private static void imprimeMultiplo3() {
        for (int i = 1; i < 100; i++) {
            if(i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void imprimeFatorial(int a) {
        long fatorial = 1;
        System.out.print("|| 0! = 1 || ");
        for (int i = 1; i < a+1; i++) {
            fatorial *= i;
            System.out.print (i + "! = " + fatorial + " || ");
        }
    }

    private static void fibonacci() {
        long F = 0;     // atual
        long ant = 1;   // anterior

        while (F < 100) {
            System.out.println(F + " ");
            F += ant;
            ant = F - ant;
        }
    }

    private static void novox(int x){
        System.out.print(x + " ");
        while(x > 1) {
            if (x % 2 == 0) x /= 2;
            else x = (3 * x) + 1;
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        //imprimeNumeros();
        //imprimeSoma();
        //imprimeMultiplo3();
        //imprimeFatorial(10);
        //imprimeFatorial(20);
        //imprimeFatorial(30);
        //imprimeFatorial(40);
        //fibonacci();
        //novox(40);
    }
}
