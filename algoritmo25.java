import java.util.Scanner;

public class algoritmo25 {
    public static void main(String[] args) {
        //variaveis 
        int[] vetor = new int[10];
        Scanner entrada = new Scanner(System.in);
        
        //entrada 
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor do vetor: ");
            vetor[i] = entrada.nextInt();
        }
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i]);
        }
        entrada.close();       
    }
}
