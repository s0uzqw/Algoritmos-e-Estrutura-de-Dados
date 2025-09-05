package aula21_08;

import java.util.Scanner;

public class vetorMultiCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de números contidos no vetor: ");
        int n = entrada.nextInt();

        int VetorNormal[] = new int[n];
        System.out.println("Informe os números: ");
        for (int i = 0; i < n; i++) {
            VetorNormal[i] = entrada.nextInt();
        }

        int vetorMultiCinco[] = new int[n];

        System.out.println("Números múltiplos de Cinco: ");
        boolean encontrou = false;
        for (int i = 0; i < n; i++) {
            if (VetorNormal[i] % 5 == 0) {
                vetorMultiCinco[i] = VetorNormal[i];
                System.out.printf("%d  ", VetorNormal[i]);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Não tem números múltiplos de cinco");
        }

        entrada.close();
    }
}
