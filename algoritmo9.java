import java.util.Scanner;

public class algoritmo9 {
    public static void main(String[] args) {
        //variaveis 
        int numero, p = 0, i = 0;
        Scanner entrada = new Scanner(System.in);
        
        //entrada 
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        //processamento 
        if (numero %2 == 0) {
            p = numero;
        } else {
            i = numero;
        }   
         //saida 
        System.out.println("O numero " + i + " e impar");
        System.out.println("O numero " + p + " e par");
        entrada.close();

                
    }
}
