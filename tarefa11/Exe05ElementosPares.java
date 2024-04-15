package tarefa11;
public class Exe05ElementosPares {

	public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; 
        int contador = 0;  

    
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contador++;
            }
        }

        System.out.println("O vetor tem " + contador + " números pares.");
    }
}