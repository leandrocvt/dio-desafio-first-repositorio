import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2Note {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a note: ");
        Integer note = sc.nextInt();

        while (note < 0 || note > 10){
            System.out.print("Note invalid! Type it again: ");
            note = sc.nextInt();
        }

    }
}
