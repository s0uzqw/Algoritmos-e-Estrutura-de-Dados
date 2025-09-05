package Lampada;
import java.util.Scanner;

public class UsaLampada {
    public static void main(String[] args) {
        Lampada lp = new Lampada();
        Scanner entrada = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 3) {
            System.out.println("\n0 - Desligar lampada");
            System.out.println("1 - Ligar lampada");
            System.out.println("2 - Mostrar status");
            System.out.println("3 - Sair\n");

            opcao = entrada.nextInt();

            if (opcao == 0) {
                lp.statusDesligada();
            } else if (opcao == 1) {
                lp.statusLigada();
            } else if (opcao == 2) {
                lp.mostrarStatus();
            } else if (opcao == 3) {
            } else {
                System.out.println("Opção inválida.");
                main(args);
            }
        }
        entrada.close();
    }
}