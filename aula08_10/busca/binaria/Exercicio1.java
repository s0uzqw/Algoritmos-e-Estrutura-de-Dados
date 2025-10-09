package aula08_10.busca.binaria;

import java.util.Scanner;

public class Exercicio1 {

    static int buscaBinaria(int v[], int elem) {
        int inicio = 0, meio, fim = v.length - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (elem < v[meio]) {
                fim = meio - 1;
            } else if (elem > v[meio]) {
                inicio = meio + 1;
            } else {
                return meio;
            }
        }
        return -1;
    }

    public static void insertionSort(int v[]) {
        int atual;
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
        int numeros[] = new int[20];
        int valorASerEncontrado;

        for (int i = 0; i < 20; i++) {
            System.out.printf("Informe o número do indice %d: ", i);
            numeros[i] = entrada.nextInt();
        }

        insertionSort(numeros);

        System.out.println("\nVetor ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\nInforme o valor que deseja encontrar:");
        valorASerEncontrado = entrada.nextInt();

        int indice = buscaBinaria(numeros, valorASerEncontrado);
        if (indice > -1) {
            System.out.printf("Valor encontrado no indice %d", indice);
        } else {
            System.out.println("Valor não encontrado");
        }
        entrada.close();
    }
}