import java.util.Scanner;

public class MenorTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de temperaturas: ");
        int n = entrada.nextInt();

        double[] temperaturas = new double[n];

        System.out.println("Digite as temperaturas em ºC:");
        for (int i = 0; i < n; i++) {
            temperaturas[i] = entrada.nextDouble();
        }

        double menor = temperaturas[0];
        for (int i = 1; i < n; i++) {
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        System.out.print("Temperaturas = [");
        for (int i = 0; i < n; i++) {
            System.out.print(temperaturas[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Menor temperatura = " + menor + " ºC");

        entrada.close();
    }
}
