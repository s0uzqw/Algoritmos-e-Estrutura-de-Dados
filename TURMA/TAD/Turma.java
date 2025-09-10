
import java.util.Scanner;

public class Turma {
    public static void main(String[] args) {
        Aluno al = new Aluno();

        Scanner entrada = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 7) {
            System.out.println("\n\n0 - Inserir nome do aluno");
            System.out.println("1 - Mostrar turma");
            System.out.println("2 - Atribuir nota");
            System.out.println("3 - Mostrar notas");
            System.out.println("4 - Calcular media");
            System.out.println("5 - Media da turma");
            System.out.println("6 - Mostrar informações");
            System.out.println("7 - Sair\n");

            opcao = entrada.nextInt();
            if (opcao == 0) {
                al.nomeAluno();
            } else if (opcao == 1) {
                al.mostrarTurma();
            } else if (opcao == 2) {
                al.atribuirNota();
            } else if (opcao == 3) {
                al.mostrarNotas();
            } else if (opcao == 4) {
                al.calcularMedia();
            } else if (opcao == 5) {
                al.mediaTurma();
            } else if (opcao == 6) {
                al.mostrarInfos();
            } else if (opcao == 7) {

            } else {
                System.out.println("Opção inválida");
            }
        }
        entrada.close();
    }
}
