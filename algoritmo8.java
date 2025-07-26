import java.util.Scanner;

public class algoritmo8 { 
    public static void main(String[] args) {
        //variaveis 
        int numero, a, b; 
        Scanner teclado = new Scanner(System.in);

        //entrada 
        System.out.println("Digite um numero: ");
        numero = teclado.nextInt();

        //processamento
        if (numero > 0) {
            a = numero;
            //saida 1 
            System.out.println("O numero " + a + " e positivo");
        } else {
            //saida 2
            System.out.println("O numero " + numero + " e negativo");
            b = numero;

        }
        
        
    }
    
}