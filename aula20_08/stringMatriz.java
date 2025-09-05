package aula20_08;

import java.util.Scanner;

public class stringMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas: ");
        int l = entrada.nextInt();

        System.out.println("Informe a quantidade de colunas: ");
        int c = entrada.nextInt();

        String Matriz[][] = new String[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Escreva o nome: ");
                Matriz[i][j] = entrada.next();
            }
        }

        System.out.println();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf(" %s ", Matriz[i][j]);
            }
            System.out.println();
        }

        entrada.close();
    }

}
