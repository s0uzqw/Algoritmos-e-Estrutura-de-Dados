package ExerciciosNicholas.Exercicio2;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("1 - Cadastrar atleta");
        System.out.println("2 - Listar atleta por categoria");
        System.out.println("3 - Listar todos atletas");
        System.out.println("4 - Sair");
        int opcao = entrada.nextInt();
        entrada.nextLine();

        return opcao;
    }

    static Atleta cadastrarAtleta(Atleta v[]) {
        Atleta at = new Atleta();

        System.out.println("Número de inscrição:");
        at.numeroInscricao = entrada.nextInt();

        System.out.println("Nome:");
        at.nome = entrada.next();

        System.out.println("Tempo em minutos:");
        at.tempoEmMinutos = entrada.nextDouble();

        System.out.println("Categoria:");
        at.categoria = entrada.next();

        return at;
    }

    static void listarPorCategoria(Atleta v[], int total) {
        System.out.println("Categoria\t\t\tNumero de inscrição\t\t\tNome\t\t\tTempo em Minutos");
        for (int i = 0; i < total; i++) {
            Atleta at = v[i];
            System.out.printf("%s\t\t\t%d\t\t\t%s\t\t\t%.2f\n", at.categoria, at.numeroInscricao, at.nome, at.tempoEmMinutos);
        }
    }

    static void listarTodos(Atleta v[], int total) {
        System.out.println("Numero de inscrição\t\t\tNome\t\t\tTempo em Minutos\t\t\tCategoria");
        for (int i = 0; i < total; i++) {
            Atleta at = v[i];
            System.out.printf("%d\t\t\t%s\t\t\t%.2f\t\t\t%s\n", at.numeroInscricao, at.nome, at.tempoEmMinutos, at.categoria);
        }
    }

    static void InsertionSortCategoria(Atleta v[], int total) {
        for (int i = 0; i < total; i++) {
            Atleta atual = v[i];
            int j = i;
            while (j > 0 && atual.categoria.compareToIgnoreCase(v[j - 1].categoria) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void InsertionSortTodos(Atleta v[], int total) {
        for (int i = 0; i < total; i++) {
            Atleta atual = v[i];
            int j = i;
            while (j > 0 && atual.numeroInscricao < v[j - 1].numeroInscricao) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    public static void main(String[] args) {
        Atleta atletas[] = new Atleta[20];
        int opcao;
        int total = 0;
        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                atletas[total] = cadastrarAtleta(atletas);
                total++;
            } else if (opcao == 2) {
                InsertionSortCategoria(atletas, total);
                listarPorCategoria(atletas, total);
            } else if (opcao == 3) {
                InsertionSortTodos(atletas, total);
                listarTodos(atletas, total);
            }
        } while (opcao != 4);
    }
}
