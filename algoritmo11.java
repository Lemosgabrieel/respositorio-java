import java.util.Scanner;

public class algoritmo11 {
    public static void main(String[] args) {
        // Declaração de variáveis
        double pesoPeixes, excesso, multa;
        double limite = 50.0;
        double valorMultaPorKg = 4.0;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o peso dos peixes em kg: ");
        pesoPeixes = teclado.nextDouble();

        // Processamento
        if (pesoPeixes > limite) {
            excesso = pesoPeixes - limite;
            multa = excesso * valorMultaPorKg;
        } else {
            excesso = 0;
            multa = 0;
        }

        // Saída
        System.out.println("Peso total de peixes: " + pesoPeixes + " kg");
        System.out.println("Excesso de peso: " + excesso + " kg");
        System.out.println("Valor da multa: R$ " + multa);

        teclado.close();
    }
}
