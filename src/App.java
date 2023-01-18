import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();

        System.out.println("qual o tamanho das suas listas de comparação?");
        int tam = sc.nextInt();

        System.out.println("Preenchendo a primeira lista: ");

        for(int i = 0; i < tam; i++) {
            System.out.println((i+1) +"ª posição: ");
            String word = sc.nextLine();
            l1.add(word);
        }

        System.out.println("Preenchendo a segunda lista: ");

        for(int i = 0; i < tam; i++) {
            System.out.println((i+1) +"ª posição: ");
            String word = sc.nextLine();
            l2.add(word);
        }

        for(int i = 0; i < tam; i++) {
            for(int j = 0; j < tam; j++) {
                if(l1.get(i).equals(l2.get(j))) {
                    System.out.println("Duplicado: " + l1.get(i));
                }
            }
        }
    }
}
