package tarefa11;
public class Exe10UniãodeVetores {
public static void main(String[] args) {
	int[] vetor1 = {1, 2, 3};  
	int[] vetor2 = {4, 5, 6}; 
	int[] vetor3 = new int[vetor1.length + vetor2.length];


	for (int i = 0; i < vetor1.length; i++) {
		vetor3[i] = vetor1[i];
	}


	for (int i = 0; i < vetor2.length; i++) {
		vetor3[i + vetor1.length] = vetor2[i];
	}


	System.out.print("Vetor unido: ");
	for (int i = 0; i < vetor3.length; i++) {
		System.out.print(vetor3[i] + " ");
	}
}
}
