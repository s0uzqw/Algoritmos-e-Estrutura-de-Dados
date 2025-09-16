import java.util.Scanner;

public class multiplosDeCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int n = entrada.nextInt();

        int[] original = new int[n];

        System.out.println("Digite os valores:");
        for (int i = 0; i < n; i++) {
            original[i] = entrada.nextInt();
        }

        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (original[i] % 5 == 0) {
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("Não existem valores múltiplos de 5 no vetor original.");
        } else {
            int[] multiplos = new int[contador];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (original[i] % 5 == 0) {
                    multiplos[j] = original[i];
                    j++;
                }
            }

            System.out.print("Vetor de múltiplos de 5 = [");
            for (int i = 0; i < multiplos.length; i++) {
                System.out.print(multiplos[i]);
                if (i < multiplos.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        entrada.close();
    }
}
