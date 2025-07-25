import java.util.Scanner;

public class algoritmo2 {

    public static void main(String[] args) {
        //variaveis 
        int quantidade_minima, quantidade_maxima;
        float estoque_medio;
        Scanner teclado = new Scanner(System.in);
        //entrada de dados
        System.out.println("Digite a quantidade minima do produto: ");  
        quantidade_minima = teclado.nextInt();
        System.out.println("Digite a quantidade maxima do produto: ");  
        quantidade_maxima = teclado.nextInt();
        //processamento
        estoque_medio = (quantidade_minima + quantidade_maxima) / 2.0f;
        //saida 
        System.out.println("o estoque medio do produto e: " + estoque_medio);
        teclado.close();

    }
}
