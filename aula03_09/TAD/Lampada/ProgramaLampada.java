package aula03_09.TAD.Lampada;

import java.util.Scanner;

public class ProgramaLampada {
    public static void main(String[] args) {
        Lampada lp = new Lampada();
        Scanner entrada = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 3) {
            System.out.println("0 - Desligar lampada.");
            System.out.println("1 - Ligar lampada.");
            System.out.println("2 - Mostrar status.");
            System.out.println("3 - Sair.");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 0:
                    lp.statusDesligado();
                    break;
                case 1:
                    lp.statusLigado();
                    break;
                case 2:
                    lp.mostrarStatus();
                    ;
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
        entrada.close();
    }
}