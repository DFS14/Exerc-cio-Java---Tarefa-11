package tarefa11;
public class Exe06FrequênciadeElementos  {
public static void main(String[] args)  {
	
	
int[] vetor = {5, 2, 2, 3, 3, 3, 9 , 4, 4, 4, 10, 4, 3, 4, 5, 6, 7, 8, 9, 10}; 
int max = 0;


		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > max) {
				max = vetor[i];
			}
		}

		int[] frequencias = new int[max + 1];


		for (int i = 0; i < vetor.length; i++) {
			frequencias[vetor[i]]++;
		}


		for (int i = 0; i < frequencias.length; i++) {
			if (frequencias[i] > 0) {
				System.out.println("Elemento: " + i + ", Frequência: " + frequencias[i]);
			}
		}
	}
}