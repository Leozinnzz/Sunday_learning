import java.util.Locale;
import java.util.Scanner;

public class Week2 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = input.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        int idade = input.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if(idade >= 18) System.out.println("Maior de idade");
        else System.out.println("Menor de idade");


    }
}
