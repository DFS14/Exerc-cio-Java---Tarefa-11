package tarefa11;
public class Exe04VetorInvertido {
	  public static void main(String[] args) {
	        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
	        int[] vetorInvertido = new int[vetor.length];  

	        for (int i = 0; i < vetor.length; i++) {
	            vetorInvertido[i] = vetor[vetor.length - 1 - i];
	        }


	        System.out.print("Vetor invertido: ");
	        for (int i = 0; i < vetorInvertido.length; i++) {
	            System.out.print(vetorInvertido[i] + " ");
	        }
	    }
	}