package aula20_08;

import java.util.Scanner;

public class somaMatrizBi {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somatoria = 0;

        System.out.println("Informe a quantidade de linhas");
        int l = entrada.nextInt();

        System.out.println("Informe a quantidade de colunas");
        int c = entrada.nextInt();

        int Matriz[][] = new int[l][c];

        System.out.println("Informe os valores: ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                Matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println();

        System.out.println("Valores informados: \n");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf(" %d ", Matriz[i][j]);
                somatoria += Matriz[i][j];
            }
            System.out.println();
        }

        System.out.printf("\nSoma dos valores: %d", somatoria);

        entrada.close();
    }

}
