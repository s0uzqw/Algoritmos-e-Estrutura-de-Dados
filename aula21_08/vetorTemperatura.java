package aula21_08;

import java.util.Locale;
import java.util.Scanner;

public class vetorTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de temperaturas: ");
        int n = entrada.nextInt();
        
        double Temperaturas[] = new double[n];

        System.out.println("Informe as temperaturas: ");
        for(int i = 0; i < n; i++) {
            Temperaturas[i] = entrada.nextDouble();
        }

        System.out.println("Temperaturas informadas: ");
        for(int i = 0; i < n; i++) {
            System.out.printf(Locale.US, "%.1f ºC\n",Temperaturas[i]);
        }

        double menor = Temperaturas[0];
        for(int i = 0; i < n; i++) {
            if (Temperaturas[i] < menor) {
                menor = Temperaturas[i];
            }
        }
        System.out.printf(Locale.US, "Menor temperatura: %.1f ºC\n", menor);

        entrada.close();
    }
}
