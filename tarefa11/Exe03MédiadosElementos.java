package tarefa11;
public class Exe03MédiadosElementos {

	public static void main(String[] args) {
      float[] vetor = {1.2f, 2.3f, 3.4f, 4.5f, 5.6f, 6.7f, 7.8f};
      float soma = 0; 

      
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

     
        float media = soma / vetor.length;

        System.out.println("A média dos elementos do vetor é: " + media);
    }
}