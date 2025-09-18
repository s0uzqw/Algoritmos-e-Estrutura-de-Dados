package aula17_09.ordenacao.exercicios;

import java.util.Scanner;

public class exercicio1 {

    public static void insertionSort(double v[]) {
        double atual;
        for (int i = 1; i < v.length; i++) {
            atual = v[i];
            int j;
            for (j = i; (j > 0) && (atual < v[j - 1]); j--) {
                v[j] = v[j - 1];
            }
            v[j] = atual;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] peso = new double[15];

        System.out.println("Informe os 15 pesos: ");
        for (int i = 0; i < 15; i++) {
            peso[i] = entrada.nextDouble();
        }

        insertionSort(peso);

        System.out.println("\nPesos ordenados:");
        for (int i = 0; i < 15; i++) {
            System.out.println(peso[i]);
        }

        entrada.close();
    }
}
