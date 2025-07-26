import java.util.Scanner;

public class algoritmo6 {

    public static void main(String[] args) {
        //variaveis 
        float altura, pesoIdeal;
        Scanner teclado = new Scanner(System.in);

        //entradas 
        System.out.println("Digite sua altura: ");
        altura = teclado.nextFloat();

        //processamento
        pesoIdeal = (float) ((72.7 * altura) - 58);

        //saida
        System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
        teclado.close();
    }
}