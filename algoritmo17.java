import java.util.Scanner;



public class algoritmo17 {
    public static void main(String[] args) {
        //variaveis
        int n, maior = 0; 
        Scanner entrada = new Scanner(System.in);

        //entrada 
        System.out.println("Digite um numero: ");
        n = entrada.nextInt();

        while (n != 0) {
            if (n > maior) {
                maior = n;
            }
            System.out.println("Digite um numero: ");
            n = entrada.nextInt();

        }
        System.out.println("O maior numero digitado foi: " + maior);
        entrada.close();
    }
    
}
