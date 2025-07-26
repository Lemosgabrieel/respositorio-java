import java.util.Scanner;

public class algoritmo4 {
    public static void main(String[] args) {
        //variaveis 
        int metros, centimetros; 
         Scanner teclado = new Scanner(System.in);

         //entrada 
         System.out.println("Digite a medida em metros: ");
         metros = teclado.nextInt();

         //processamento 
         centimetros = metros * 100;

         //saida 
         System.out.println("a medida em centimetros e: " + centimetros + " cm");
         teclado.close();
    }        
}
