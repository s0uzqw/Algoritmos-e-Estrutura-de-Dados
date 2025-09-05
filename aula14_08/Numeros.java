package aula14_08;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        int somatorio = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 5 números: ");
        for(int i = 0; i < 5; i++) {
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Números digitados: \n");
        for(int i = 0; i < 5; i++) {
            somatorio += numeros[i];
            System.out.println(numeros[i]);
        }
        System.out.printf("\nSomatorio: %d", somatorio);

        entrada.close();
    }
}
