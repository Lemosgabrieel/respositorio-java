import java.util.Scanner;

public class algoritmo20 {
    public  static void main(String[] args) {
            //variaveis 
            int valor, maior = -9999, menor = 9999, soma = 0;
            float media;
            Scanner entrada = new Scanner(System.in);

            for (int i = 0; i < 10; i++) {
                System.out.println("digite um valor: ");
                valor = entrada.nextInt();

                if(valor > 0 ) {
                    if(valor > maior) {
                        maior = valor;
                    }
                    if (valor < menor) {
                        menor = valor;
                    }
                    soma = soma + valor; 
                } else {
                    i--;           
                }
    }
    media = soma / 10;
    System.out.println("O maior valor é: " + maior);
    System.out.println("O menor valor é: " + menor);
    System.out.println("A soma dos valores é: " + soma);
    System.out.println("A média dos valores é: " + media);  
    entrada.close();    
    }
}
