package arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1ReverseOrder {
    public static void main(String[] args) {

        int[] vector = {-2, -5, 7, 26, 4, 9};

       /* Exibir os valores de um vetor
       for (int i=0; i<vector.length; i++){
           System.out.print(vector[i] + " ");
       }

       int count = 0;
       while (count < (vector.length)){
           System.out.print(vector[count] + " ");
           count++;
       }*/

        //Solução
        for (int i = (vector.length - 1); i >= 0; i--){
            System.out.print(vector[i] + " ");
        }
    }
}
