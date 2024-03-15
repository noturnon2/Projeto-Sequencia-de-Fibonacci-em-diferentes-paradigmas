package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
       System.out.println("Digite um número: ");
        int f = new Scanner(System.in).nextInt();

            for (int i = 1; i <= f; i++) {
            System.out.print("Fibonacci de " + i + " é: ");
            System.out.println( new CalculoFib(i));
            }

        System.out.print("A soma de fib(1) até fib(" + f);
        System.out.println(") é: " + new CalculoFib(f).soma());
    }
}