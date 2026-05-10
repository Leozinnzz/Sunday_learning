import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Week2_2 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int n = 5;

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            vet[i] = rand.nextInt(8);
        }

        System.out.println("Vetor gerado: ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vet[i] + "] ");
        }

        int contEmpate = 0;
        int freq = vet[0];
        int cont = 0;
        int maiorqtd = 0;
        int idc = 0;
        for (int i = 0; i < n; i++) {
            cont = 0;
            for (int j = 0; j < n; j++) {

                if (vet[i] == vet[j]) {
                    cont++;
                }
            }
            if (cont > maiorqtd) {
                maiorqtd = cont;
                freq = vet[i];
                idc = i;
                contEmpate = 1;
            }

            else if(cont == maiorqtd)
                contEmpate++;
        }
        int menor = vet[0];

        System.out.println("Numero mais frequente: " + freq);
        System.out.println("Frequência: " + maiorqtd);
        System.out.println("Primeiro Indice: " + idc);
        if(contEmpate > 1) {
            for(int i = 0;  i < n; i++) {
                cont = 0;
                for(int j = 0; j <n; j++) {
                    if (vet[i] == vet[j])
                        cont++;
            }
                if(cont == maiorqtd)
                    menor = (menor < vet[i]) ? menor : vet[i];
            }
            System.out.println("Menor numero entre os empatados: " + menor);
        }

    }
}
