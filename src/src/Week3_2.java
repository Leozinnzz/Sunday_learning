import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week3_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> vog = new ArrayList<>();

        vog.add("A");
        vog.add("E");
        vog.add("I");
        vog.add("O");
        vog.add("U");
        int cont = 0;

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toUpperCase();

        for(int i = 0; i < palavra.length(); i++) {
            char l = palavra.charAt(i);
            for(int j = 0; j < vog.size(); j++) {
                if(vog.get(j).equals(String.valueOf(l)))
                    cont++;
            }
        }
        System.out.println("Total de vogais: " + cont);
    }
}
