import java.util.Scanner;

public class algoritmo27 {
    public static void main(String[] args) {
        //variaveis 
        int[] vetor = new int[10];
        boolean tem_maior_50 = false; 
        Scanner entrada = new Scanner(System.in);

        //processamento 
        for (int i=0; i < 10; i++) { 
            System.out.printf("informe o valor para o vetor%d/10\n", i + 1);
            vetor[i] = entrada.nextInt();
        }
        for (int i=0; i < 10; i++) {
            if (vetor[i] > 50) {
                System.out.printf("o numero %d esta na posicao %d\n", vetor[i], i);
                tem_maior_50 = true;
            }
        }
        if (!tem_maior_50) {
            System.out.println("nenhum numero maior que 50 foi encontrado");
        }
        entrada.close(); 
    }
}
