import java.util.ArrayList;

public class algoritmo23 {
    public static void main(String[] args) {
        //variaveis
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        ArrayList<Integer> pares = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            vetor.add(i);
            if (i % 2 == 0) {
                if (i > 0) {
                    pares.add(i);
                }
            }
        }
        for (Integer n : pares) {
             System.out.println(n);
        }
    }   
}
 