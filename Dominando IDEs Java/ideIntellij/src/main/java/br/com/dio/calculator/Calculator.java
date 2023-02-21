package br.com.dio.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b;

        System.out.println("Informe o primeiro número: ");
        a = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        b = sc.nextDouble();

        double sum = sum(a, b);
        double mult = mult(a, b);
        double sub = sub(a, b);
        double div = div(a, b);

        System.out.println("Soma: " + sum);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.printf("Divisão: %.2f" , div);

    }

    public static Double sum(Double a, Double b){
        return a + b;
    }
    public static Double mult(Double a, Double b){
        return a * b;
    }
    public static Double sub(Double a, Double b){
        return a - b;
    }
    public static Double div(Double a, Double b){
        return a / b;
    }
}
