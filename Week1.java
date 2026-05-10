import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 7;
        double[] vet = new double[n];

        double sumTemp = 0;
        int acima_media = 0;
        int abaixo_media = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Digite a " + (i+1) + "° temperatura: ");
            vet[i] = sc.nextDouble();
            sumTemp += vet[i];

        }

        double media = sumTemp / n;

       double menor_temp = vet[0];
       double maior_temp = vet[0];

        for(int i = 0; i < n; i++) {
            maior_temp = (vet[i] > maior_temp) ? vet[i] : maior_temp;
            menor_temp = (vet[i] < menor_temp) ? vet[i] : menor_temp;

            if(vet[i] > media)
                acima_media++;
            if(vet[i] < 15.0)
                abaixo_media++;
        }


        System.out.printf("\n===================Saida====================\n");
        System.out.printf("Media: %.2f\n", media);
        System.out.printf("Maior temperatura: %.1f\n", maior_temp);
        System.out.printf("Menor temperatura: %.1f\n", menor_temp);
        System.out.println("Dias acima da media: " + acima_media);
        System.out.println("Dias abaixo de 15C: " + abaixo_media);
        System.out.print("Mensagem do clima: ");
        if(media >= 30)
            System.out.println("Clima muito quente");
        else if(media >= 20 && media <= 29)
            System.out.println("Clima agradavel");
        else
            System.out.println("Clima Frio");

        sc.close();
    }
}