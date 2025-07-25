import java.util.Scanner; 

public class algoritmo1 {
    public static void main(String[] args) {
        int num1, num2, soma, multiplicacao;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = teclado.nextInt();

        //processamento 
        soma = num1 + num2;
        multiplicacao = num1 * num2;

        //saida
        System.out.println("A soma é: " + soma);
        System.out.println("A multiplicação é: " + multiplicacao);
        teclado.close();    
    } 
}
