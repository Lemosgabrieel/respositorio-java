import java.util.Scanner;

public class algoritmo16 {
    public static void main(String[] args) {
        //variaveis 
        int idade;
        Scanner teclado = new Scanner(System.in);

        //entrada 
        System.out.println("Digite a sua idade: ");
        idade = teclado.nextInt();

        //processamento 
        if(idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if(idade >= 8 && idade <= 11) {
            System.out.println("Infantil B");
        } else if(idade >= 12 && idade <= 13) {
            System.out.println("Juvenil A");
        } else if(idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if(idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idade inválida para categorias de natação.");
        }
    
    }
}