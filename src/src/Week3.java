import java.util.Locale;
import java.util.Scanner;

public class Week3 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = input.nextInt();

        System.out.println("Antecessor: " + (n-1));
        System.out.println("Sucessor: " + (n+1));


        input.close();
    }
}
