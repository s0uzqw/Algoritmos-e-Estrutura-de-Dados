import java.util.Scanner;

public class ProgramaLivro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Livro lv = new Livro();

        int opcao = -1;

        while (opcao != 5) {
            System.out.println("1 - Titulo do livro");
            System.out.println("2 - Autor do livro");
            System.out.println("3 - Ano de publicação do livro");
            System.out.println("4 - Ver informações do livro: ");
            System.out.println("5 - Sair");

            opcao = entrada.nextInt();

            if (opcao == 1) {
                lv.titulo();
            } else if (opcao == 2) {
                lv.autor();
            } else if (opcao == 3) {
                lv.ano();
            } else if (opcao == 4) {
                lv.infoLivro();
            } else if(opcao == 5) {

            } else {
                System.out.println("Opção inválida");
            }

        }
        entrada.close();
    }
}
