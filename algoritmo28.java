import java.util.Scanner;

public class algoritmo28 {
    public static void main(String[] args) {
        //variaveis
        float[] vetor = new float[5];
        int codigo;
        Scanner entrada = new Scanner(System.in);

        //entrada 
        System.out.println("informe o codigo: ");
        codigo = entrada.nextInt();
        
        if(codigo != 0) {
            for(int i = 0; i < 5; i++) {
                System.out.println("informe um numero real: ");
                vetor[i] = entrada.nextFloat();
            }
            if (codigo == 1) {
                for (int i=0; i < 5; i++) {
                    System.out.println(vetor[i]);
                }
            }
            if (codigo == 2) {
                for (int i = (vetor.length - 1); i >= 0; i--) {
                    System.out.println(vetor[i]);
                }
            }
        }
        entrada.close();   
    }
}