package aula17_09.ordenacao.exercicios;

import java.util.Scanner;

public class exercicio2 {
    
    static void lerNomes(String v[]) {
        Scanner teclado = new Scanner(System.in);
        int tamanhoVetor = v.length;
        System.out.println("Digite o nome de 10 pessoas.");
        for(int i = 0; i < tamanhoVetor; i++) {
            System.out.printf("Nome %d: ", i+1);
            v[i] = teclado.nextLine();
        }
        teclado.close();
    }

    static void mostrar(String v[]) {
        System.out.println("---------- Lista de nomes ----------");
        int tamanhoVetor = v.length;
        for(int i = 0; i < tamanhoVetor; i++) {
            System.out.printf("%s   ", v[i]);
        }
        System.out.println("\n----------");
    }

    static void troca(String v[], int atual, int proxima) {
        String aux = v[atual];
        v[atual] = v[proxima];
        v[proxima] = aux;
    }

    static void bubbleSort(String v[]) {
        int continua, fim;
        fim = v.length;
        do {
            continua = 0;
            for(int i = 0; i < fim - 1; i++) {
                if (v[i].compareToIgnoreCase(v[i+1]) > 0) {
                    troca(v, i, i+1);
                    continua = i;
                }
            }
        } while(continua != 0);
    }

    public static void main(String[] args) {
        String nomes[] = new String[10];
        lerNomes(nomes);
        mostrar(nomes);
        bubbleSort(nomes);
        mostrar(nomes);
    }

}