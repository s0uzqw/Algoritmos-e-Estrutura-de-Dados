package aula20_08;

import java.util.Scanner;

public class escreverElementos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String Vetor[] = new String[5];

        System.out.println("Digite os elementos: ");
        for (int i = 0; i < 5; i++) {
            Vetor[i] = entrada.next();
        }
        System.out.println("Elementos digitados: ");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nome: %s\n", Vetor[i]);
        }

        entrada.close();
    }
}


