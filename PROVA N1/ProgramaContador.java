import java.util.Scanner;

public class ProgramaContador {
    public static void main(String[] args) {
        Contador ct = new Contador();

        Scanner entrada = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 5) {
            System.out.println("\n\n1 - Inserir Valor:");
            System.out.println("2 - Incrementar Valor:");
            System.out.println("3 - Decrementar Valor:");
            System.out.println("4 - Obter valor atual:");
            System.out.println("5 - Sair\n");

            opcao = entrada.nextInt();

            if (opcao == 1) {
                ct.inserirValor();
            } else if (opcao == 2) {
                ct.incrementar();
            } else if (opcao == 3) {
                ct.decrementar();
            } else if (opcao == 4) {
                ct.obterValor();
            } else if (opcao == 5) {
                
            } else {
                System.out.println("Opção inválida");
            }
        }
        entrada.close();
    }
}
