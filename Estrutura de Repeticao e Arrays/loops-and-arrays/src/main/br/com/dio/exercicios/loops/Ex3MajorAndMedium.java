package com.dio.exercicios.loops;

import java.util.Locale;
import java.util.Scanner;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3MajorAndMedium {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double higher = 0.0, sum = 0.0, average = 0.0;

        do {
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();
            if (number > higher ) higher  = number;
            sum += number;
            count++;
        }while (count < 5);

        average = sum / 5;

        System.out.println("\nHigher number: " + higher);
        System.out.printf("Avarage: %.2f", average);
    }
}
