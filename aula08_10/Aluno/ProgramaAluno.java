package aula08_10.Aluno;

import java.util.Scanner;

public class ProgramaAluno {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];

        int opcao = -1;

        while (opcao != 3) {
            System.out.println("\n1 - Cadastrar 10 Alunos");
            System.out.println("2 - Buscar Aluno");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                for (int i = 0; i < 10; i++) {
                    Aluno aluno = new Aluno();

                    System.out.printf("Digite o nome do aluno %d: ", i + 1);
                    String nome = entrada.nextLine();
                    aluno.atribuirNome(nome);

                    System.out.println("Digite as 4 notas do aluno:");
                    for (int j = 0; j < 4; j++) {
                        System.out.printf("Nota %d: ", j + 1);
                        double nota = entrada.nextDouble();
                        aluno.atribuirNota(nota, j);
                    }
                    entrada.nextLine();
                    alunos[i] = aluno;
                }
            } 
            else if (opcao == 2) {
                System.out.print("Digite o nome do aluno a buscar: ");
                String nomeBusca = entrada.nextLine();
                boolean encontrado = false;

                for (Aluno aluno : alunos) {
                    if (aluno != null && aluno.pegarNome().equalsIgnoreCase(nomeBusca)) {
                        System.out.println("\nAluno encontrado!");
                        System.out.println("Nome: " + aluno.pegarNome());
                        aluno.mostrarNotas();
                        aluno.mostrarMedia();
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Aluno não encontrado.");
                }
            }
        }

        entrada.close();
        System.out.println("Programa encerrado.");
    }
}
