package tarefa11;
public class Exe09RemoverElemento {
public static void main(String[] args) {

	        int[] vetor = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};  
	        int elementoParaRemover = 2; 
	        int contador = 0;
	        
	        for (int a = 0; a < vetor.length; a++) {
	            if (vetor[a] == elementoParaRemover) {
	                contador++;
	            }
	        }

	
	        int[] vetorNovo = new int[vetor.length - contador];
	        int b = 0;
	        for (int a = 0; a < vetor.length; a++) {
	            if (vetor[a] != elementoParaRemover) {
	                vetorNovo[b] = vetor[a];
	                b++;
	            }
	        }

	
	        System.out.print("Vetor após a remoção: ");
	        for (int a = 0; a < vetorNovo.length; a++) {
	            System.out.print(vetorNovo[a] + " ");
	        }
	    }
	}