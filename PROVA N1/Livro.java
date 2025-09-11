import java.util.Scanner;

public class Livro {
    Scanner entrada = new Scanner(System.in);

    String titulo;
    String autor;
    int ano;

    public void titulo() {
        System.out.println("Digite o título do livro: ");
        titulo = entrada.nextLine();
    }

    public void autor() {
        System.err.println("Digite o autor do livro: ");
        autor = entrada.nextLine();
    }

    public void ano() {
        System.out.println("Digite o ano de publicação do livro: ");
        ano = entrada.nextInt();
    }

    public void infoLivro() {
        System.out.printf("Título: %s\n", titulo);
        System.out.printf("Autor: %s\n", autor);
        System.out.printf("Ano de publicação: %d\n", ano);
    }
}
