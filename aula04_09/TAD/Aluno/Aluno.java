package Aluno;

import java.util.Scanner;

public class Aluno {
    Scanner entrada = new Scanner(System.in);

    String aluno;
    double notas[] = new double[4];

    public void nomeAluno() {
        System.out.println("\nInsira o nome do aluno: ");
        this.aluno = entrada.nextLine();
    }

    public void atribuirNota() {
        System.out.println("Informe as 4 notas do aluno: ");
        for (int i = 0; i < 4; i++) {
            this.notas[i] = entrada.nextDouble();
        }
    }

    public void mostrarNotas() {
        for(int i = 0; i < 4; i++) {
            System.out.printf("Nota %d são %.1f\n", i + 1, notas[i]);
        }
    }

    double assistenteMedia = 0;
    double media = 0;

    public void calcularMedia() {
        for(int i = 0; i < 4; i++) {
            assistenteMedia += this.notas[i];
            media = assistenteMedia / 4;
        }
        System.out.println("Média calculada!");
    }

    public void mostrarMedia() {
        System.out.printf("A média de %s é de %.1f", aluno, media);
    }
}
