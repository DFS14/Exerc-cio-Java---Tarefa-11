package tarefa11;
public class Exe08BuscarElemento {
public static void main(String[] args) {
	
int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
int elementoProcurado = 6; 
boolean encontrado = false; 

for (int i = 0; i < vetor.length; i++) {
if (vetor[i] == elementoProcurado) {
encontrado = true;
break;
}}


if (encontrado) {
System.out.println("O elemento " + elementoProcurado + " está presente no vetor.");
} 
else {
System.out.println("O elemento " + elementoProcurado + " não está presente no vetor.");
}}}
