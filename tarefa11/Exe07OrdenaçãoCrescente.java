package tarefa11;
public class Exe07OrdenaçãoCrescente {
public static void main(String[] args) {
int[] vetor = {5, 3, 2, 4, 1, 6, 7, 8, 9, 10}; 

	for (int a = 0; a < vetor.length - 1; a++) {
	for (int b = 0; b < vetor.length - 1 - a; b++) {
	if (vetor[b] > vetor[b + 1]) {


	int temp = vetor[b];
	vetor[b] = vetor[b + 1];
	vetor[b + 1] = temp;
	}}}

	System.out.print("Vetor ordenado: ");
	for (int a = 0; a < vetor.length; a++) {
	System.out.print(vetor[a] + " ");
	}}}