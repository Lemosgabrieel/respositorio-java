import java.util.Scanner; 

public class algoritmo15 { 
    public static void main(String[] args) { 
        //variaveis 
        float indice; 
        Scanner teclado = new Scanner(System.in);


        //entrada 
        System.out.println("informe o indice de poluição: "); 
        indice = teclado.nextFloat();

        //processamento 
        if (indice >= 0.3 && indice < 0.4) {
            System.out.println("Atenção: indùstrias do 1º grupo devem ser fechadas.");            
        }else if (indice >= 0.4 && indice < 0.5) {
            System.out.println("Atenção: indùstrias do 1º e 2º grupos devem ser fechadas.");
        }else if (indice >= 0.5) {
            System.out.println("Atenção: indùstrias do 1º, 2º e 3º grupos devem ser fechadas.");
        }
        teclado.close();    
    }
}