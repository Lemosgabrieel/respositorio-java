import java.util.Scanner;

public class algoritmo12 {
    public static void main(String[] args) {
        // Declaração de variáveis
        int codigoOperario, horasTrabalhadas;
        double salario, excedente;
        final double valorHoraNormal = 10.00;
        final double valorHoraExtra = 20.00;

        // Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o código do operário: ");
        codigoOperario = teclado.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = teclado.nextInt();

        // Processamento
        if (horasTrabalhadas > 50) {
            salario = 50 * valorHoraNormal;
            excedente = (horasTrabalhadas - 50) * valorHoraExtra;
        } else {
            salario = horasTrabalhadas * valorHoraNormal;
            excedente = 0;
        }

        // Saída
        System.out.println("Código do operário: " + codigoOperario);
        System.out.println("Salário base: R$ " + salario);
        System.out.println("Valor excedente: R$ " + excedente);
        System.out.println("Salário total: R$ " + (salario + excedente));

        teclado.close();
    }
}
