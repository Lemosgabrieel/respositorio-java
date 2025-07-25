import java.util.Scanner;

public class algoritmo3 {
    public static void main(String[] args) {
        //variaveis
        int n1, n2, soma;
        Scanner teclado = new Scanner(System.in);

        //entrada 
        System.out.println("Digite o primeiro numero: ");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = teclado.nextInt();

        //processamento 
        soma = n1 + n2;

        //saida 
        System.out.println("A soma dos numeros é: " + soma);
        teclado.close();
    }
}    