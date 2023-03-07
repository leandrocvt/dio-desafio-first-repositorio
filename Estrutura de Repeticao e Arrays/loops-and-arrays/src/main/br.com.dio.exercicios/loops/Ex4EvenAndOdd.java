package loops;

import java.util.Scanner;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4EvenAndOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of numbers: ");
        int n = sc.nextInt();

        int amountOfPair = 0;
        int amountOfOdd = 0;

        for (int i=0; i<n; i++){

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number % 2 == 0) amountOfPair += 1;
            else amountOfOdd += 1;

        }

      /*  int count = 0;
        do {
            System.out.println("Número: ");
            number = scan.nextInt();

            if (number % 2 == 0 ) amountOfPair++;
            else amountOfOdd++;

            count++;
        } while(count < n);*/

        System.out.println("\nAmount of pair: " + amountOfPair);
        System.out.println("Amount of Odd: " + amountOfOdd);
    }
}
