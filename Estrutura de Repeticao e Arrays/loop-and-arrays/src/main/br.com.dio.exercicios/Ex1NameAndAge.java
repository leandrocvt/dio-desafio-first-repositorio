import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1NameAndAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Enter your name: ");
            String name = sc.next();

            if(name.equals("0")) break;

            System.out.print("Enter your age: ");
            Integer age = sc.nextInt();
        }

    }
}
