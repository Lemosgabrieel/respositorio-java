import java.util.Scanner;
public class algoritmo5 {
    public static void main(String[] args) {
        //variaveis
        float valor_por_hora, salario;
        int horas_trabalhadas;
        Scanner teclado = new Scanner(System.in);

        //entrada 
        System.out.println("Digite o valor por hora: ");
        valor_por_hora = teclado.nextFloat();

        System.out.println("Digite o numero de horas trabalhadas: ");
        horas_trabalhadas = teclado.nextInt();  

        //processamento
        salario = valor_por_hora * horas_trabalhadas;

        //saida
        System.out.printf("O salario a receber e: R$ %.2f%n", salario);
        teclado.close();
        

    }
    
}
