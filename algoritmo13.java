import java.util.Scanner;

public class algoritmo13 {
    public static void main(String[] args) {
        //variaveis 
        int n1, n2, n3, n4;
        int q1, q2, q3, q4;
        Scanner entrada = new Scanner(System.in);
        //entrada 
        System.out.println("Digite o primeiro numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = entrada.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3 = entrada.nextInt();
        System.out.println("Digite o quarto numero: ");
        n4 = entrada.nextInt();
        //processamento 
        q1 = n1 * n1;
        q2 = n2 * n2;
        q3 = n3 * n3;
        q4 = n4 * n4;

        if (q3 >= 1000) {
            System.out.println(q3);
        }else {
            System.out.printf("n1: %d Quadrado: %d\n", n1, q1);
        }
        //saida 
        System.out.println("O quadrado do primeiro numero e: " + q1);
        System.out.println("O quadrado do segundo numero e: " + q2);
        System.out.println("O quadrado do terceiro numero e: " + q3);
        System.out.println("O quadrado do quarto numero e: " + q4);
        //fechando o scanner
        entrada.close();
        
    }
}        