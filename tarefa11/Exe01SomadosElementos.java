package tarefa11;
import java.util.Scanner;

public class Exe01SomadosElementos {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int soma = 0;  

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
}
