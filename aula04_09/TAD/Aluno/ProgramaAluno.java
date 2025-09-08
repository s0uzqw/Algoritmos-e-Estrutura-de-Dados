package Aluno;

import java.util.Scanner;

public class ProgramaAluno {
    public static void main(String[] args) {
        Aluno al = new Aluno();

        Scanner entrada = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 5) {
            System.out.println("\n\n0 - Inserir nome do aluno");
            System.out.println("1 - Atribuir nota");
            System.out.println("2 - Mostrar notas");
            System.out.println("3 - Calcular media");
            System.out.println("4 - Mostrar media");
            System.out.println("5 - Sair\n");

            opcao = entrada.nextInt();
            if (opcao == 0) {
                al.nomeAluno();
            } else if (opcao == 1) {
                al.atribuirNota();
            } else if (opcao == 2) {
                al.mostrarNotas();
            } else if (opcao == 3) {
                al.calcularMedia();
            } else if (opcao == 4) {
                al.mostrarMedia();
            } else if (opcao == 5) {

            } else {
                System.out.println("Opção inválida");
            }
        }
        entrada.close();
    }
}
