import java.util.Scanner;

public class algoritmo10 {
    public static void main(String[] args) {
             //variaveis 
             float peso_ideal, altura;
             char sexo;
             try (Scanner entrada = new Scanner(System.in)) {
                //ENTRADA 
                    System.out.println("Digite o sexo (M/F): ");
                    sexo = entrada.next().charAt(0);
                    System.out.println("Digite a altura: ");
                    altura = entrada.nextFloat();

                    //processamento 
                    if (sexo == 'M' || sexo == 'm') {
                        peso_ideal = (float) ((72.7 * altura) - 58);
                        System.out.printf("O peso ideal para o sexo masculino é: %.2f kg%n", peso_ideal);

                    } 
                    if (sexo == 'F' || sexo == 'f') {
                        peso_ideal = (float) ((62.1 * altura) - 44.7);
                        System.out.printf("O peso ideal para o sexo feminino é: %.2f kg%n", peso_ideal);
                    } else {
                        if (sexo != 'M' && sexo != 'F' && sexo != 'm' && sexo != 'f') {
                          System.out.println("Sexo inválido. Por favor, digite M ou F.");
                            return; // Encerra o programa se o sexo for inválido
                        }
                            
                    }
            }
                    
        }   
}
