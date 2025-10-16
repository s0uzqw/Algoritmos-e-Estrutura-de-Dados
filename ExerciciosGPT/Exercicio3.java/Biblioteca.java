import java.util.Scanner;

public class Biblioteca {
    static Scanner entrada = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Listar livro");
        System.out.println("3 - Sair");
        int opcao = entrada.nextInt();
        entrada.nextLine();

        return opcao;
    }

    static Livro cadastrarLivro(Livro v[]) {
        Livro lv = new Livro();

        System.out.println("Autor:");
        lv.autor = entrada.nextLine();

        System.out.println("Titulo:");
        lv.titulo = entrada.nextLine();

        System.out.println("Ano de publicação:");
        lv.anoPublicacao = entrada.nextInt();

        return lv;
    }

    static void listarLivros(Livro v[], int total) {
        System.out.println("Autor\t\t\tTitulo\t\t\tAno de publicação");
        for (int i = 0; i < total; i++) {
            Livro lv = v[i];
            System.out.printf("%s\t\t\t%s\t\t\t%d\n", lv.autor, lv.titulo, lv.anoPublicacao);
        }
    }

    static void InsertionSort(Livro v[], int total) {
        for (int i = 1; i < total; i++) {
            Livro atual = v[i];
            int j = i;
            while (j > 0 && atual.titulo.compareToIgnoreCase(v[j - 1].titulo) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    public static void main(String[] args) {
        Livro lv[] = new Livro[20];
        int opcao;
        int total = 0;
        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                lv[total] = cadastrarLivro(lv);
                total++;
            } else if (opcao == 2) {
                InsertionSort(lv, total);
                listarLivros(lv, total);
            }
        } while (opcao != 3);
    }
}
