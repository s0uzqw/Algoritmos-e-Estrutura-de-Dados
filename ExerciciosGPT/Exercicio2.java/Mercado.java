import java.util.Scanner;

public class Mercado {
    static Scanner entrada = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produto");
        System.out.println("3 - Sair");
        int opcao = entrada.nextInt();
        entrada.nextLine();

        return opcao;
    }

    static void InsertionSort(Produto v[], int total) {
        for (int i = 1; i < total; i++) {
            Produto atual = v[i];
            int j = i;
            while (j > 0 && atual.preco < v[j - 1].preco) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static Produto cadastrarProduto(Produto v[]) {
        Produto p = new Produto();

        System.out.println("Nome:");
        p.nome = entrada.nextLine();

        System.out.println("Preço:");
        p.preco = entrada.nextDouble();

        System.out.println("Quantidade:");
        p.quantidade = entrada.nextInt();

        return p;
    }

    static void listarProdutos(Produto v[], int total) {
        System.out.println("Nome\t\t\tPreço\t\t\tQuantidade");
        for (int i = 0; i < total; i++) {
            Produto p = v[i];
            System.out.printf("%s\t\t\t%.2f\t\t\t%d\n", p.nome, p.preco, p.quantidade);
        }
    }

    public static void main(String[] args) {
        Produto produtos[] = new Produto[20];
        int opcao;
        int total = 0;
        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                produtos[total] = cadastrarProduto(produtos);
                total++;
            } else if (opcao == 2) {
                InsertionSort(produtos, total);
                listarProdutos(produtos, total);
            }
        } while (opcao != 3);
    }
}
