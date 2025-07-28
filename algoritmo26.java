import java.util.Scanner;

public class algoritmo26 {
    public static void main(String[] args) {
        //variaveis 
        int[] vetor = new int[20];
        int soma = 0;
        Scanner entrada = new Scanner(System.in);

        //entrada 
        for (int i = 0; i < 20; i++) {
            System.out.printf("informe um valor para o vetor %d/20\n", i + 1);
            vetor[i] = entrada.nextInt();
            soma = soma + vetor[i];
        }
        System.out.println("A soma dos valores do vetor é: " + soma);
        entrada.close();
    }
}            