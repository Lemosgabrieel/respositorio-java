import java.util.Scanner;

public class algoritmo14 {
    
    public static void main(String[] args) {
        // Variáveis
        int numero; 
        Scanner teclado = new Scanner(System.in);
        
        // Entrada
        System.out.println("Digite um número: ");
        numero = teclado.nextInt();

        // Processamento e saída
        if (numero % 2 == 0) { // número par
            if (numero > 0) {
                System.out.println("O número " + numero + " é par e positivo.");
            } else if (numero < 0) {
                System.out.println("O número " + numero + " é par e negativo.");
            } else {
                System.out.println("O número é zero, que é considerado par.");
            }
        } else { // número ímpar
            if (numero > 0) {
                System.out.println("O número " + numero + " é ímpar e positivo.");
            } else {
                System.out.println("O número " + numero + " é ímpar e negativo.");
            }
        }

        teclado.close();
    }
}