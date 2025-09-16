import java.util.Scanner;

public class matrizOperacoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Maior elemento de cada linha:");
        for (int i = 0; i < 5; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 5; j++) {
                if (matriz[i][j] > maior) maior = matriz[i][j];
            }
            System.out.println("Linha " + (i+1) + ": " + maior);
        }

        System.out.println("Média dos elementos de cada coluna:");
        for (int j = 0; j < 5; j++) {
            int soma = 0;
            for (int i = 0; i < 5; i++) {
                soma += matriz[i][j];
            }
            double media = soma / 5.0;
            System.out.println("Coluna " + (j+1) + ": " + media);
        }

        int negativos = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] < 0) negativos++;
            }
        }
        System.out.println("Quantidade de elementos negativos: " + negativos);

        entrada.close();
    }
}
