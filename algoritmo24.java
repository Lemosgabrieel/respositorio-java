import java.util.Scanner;

public class algoritmo24 {
   public static void main(String[] args) {
        //variaveis 
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] soma = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor do vetor1: ");
            vetor1[i] = entrada.nextInt();
            System.out.print("Digite o valor do vetor2: ");
            vetor2[i] = entrada.nextInt();
            soma[i] = vetor1[i] + vetor2[i];
        }  
        for (int i = 0; i < 10; i++) {
            System.out.println("Soma dos vetores na posicao " + i + ": " + soma[i]);
        }   
        entrada.close();
    }
}
