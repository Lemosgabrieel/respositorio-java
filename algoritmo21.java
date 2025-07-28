import java.util.Scanner;

public class algoritmo21 {
     public static void main(String[] args) {
            //variaveis 
            String nome, senha; 
            Scanner teclado = new Scanner(System.in);

            //entrada 
            System.out.print("Digite o nome: ");
            nome = teclado.nextLine();
            System.out.print("Digite a senha: ");
            senha = teclado.nextLine();

            //processamento 
            while(nome.equals(senha)) {
            System.out.println("ERRO! O nome e a senha devem ser diferentes.");
            //nova entrada    
            System.out.print("Digite o nome: ");
            nome = teclado.nextLine();
            System.out.print("Digite a senha: ");
            senha = teclado.nextLine();
        }
        teclado.close();
    }
}