package tarefa11;

public class Exe02MaiorMenorValor {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int maior = vetor[0]; 
        int menor = vetor[0]; 
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O maior valor no vetor é: " + maior);
        System.out.println("O menor valor no vetor é: " + menor);
    }
}