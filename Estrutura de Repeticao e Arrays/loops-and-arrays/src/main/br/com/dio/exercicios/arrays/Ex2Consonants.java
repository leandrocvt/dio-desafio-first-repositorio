package com.dio.exercicios.arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2Consonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] consonants = new String[6];
        int amountConsonants = 0;

        int count = 0;
        do{
            System.out.print("Letter: ");
            String letter = sc.next();

            if (!(letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u"))){

                consonants[count] = letter;
                amountConsonants += 1;
            }

            count++;
        }while (count < consonants.length);

        System.out.print("Consonants: ");
        for ( String consoant : consonants) {
            if(consoant != null){
                System.out.print(consoant + " ");
            }
        }
        System.out.println("\nAmount consonants: " + amountConsonants);

    }
}
