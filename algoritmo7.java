import java.util.Scanner;

public class algoritmo7 {
    public static void main(String[] args) {
     //variaveis 
        int n;
        Scanner teclado = new Scanner(System.in);

        //entrada 
        System.out.println("Digite um numero inteiro: ");
        n = teclado.nextInt();

        //processamento e saida
        if (n>100) {
            System.out.println(n);
        } else {
            n = 0;
            System.out.println(n);
            teclado.close();
        }
    }
    
}
