package aula09_10.Exercicio1;

import java.util.Scanner;

import aula08_10.busca.binaria.buscaBin;

public class ProgramaEstoque {

    static int mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        System.out.println("--------------------------------------");
        System.out.println("Sistema de Estoque\n\n");
        System.out.println("Menu de opções\n");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos cadastrados");
        System.out.println("3 - Buscar produto pelo código");
        System.out.println("4 - Sair\n");
        System.out.println("--------------------------------------");
        System.out.print("Digite uma opção: ");
        opcao = entrada.nextInt();

        return opcao;
    }

    static Produto cadastrarProduto() {
        Scanner entrada = new Scanner(System.in);
        Produto p = new Produto();

        System.out.print("Digite o código do produto: ");
        p.codigo = entrada.next();

        entrada.nextLine();

        System.out.print("Digite o nome do produto: ");
        p.nome = entrada.nextLine();

        System.out.print("Digite o preço do produto: ");
        p.preco = entrada.nextDouble();

        System.out.print("Digite a quantidade em estoque do produto: ");
        p.quantidadeEstoque = entrada.nextInt();

        return p;
    }

    static void listarProdutos(Produto v[], int tamanhoAtual) {
        System.out.println("----------------------------------");
        System.out.println("Listagem de produtos\n");
        System.out.println("Código\t\tNome\t\tPreço\t\tEstoque\n");

        for (int i = 0; i < tamanhoAtual; i++) {
            Produto produto = v[i];
            System.out.printf("%s\t\t%s\t\t%.2f\t\t%d\n",
                    produto.codigo, produto.nome, produto.preco, produto.quantidadeEstoque);
        }

    }

    public static void insertionSort(Produto v[], int tamanho) {
        Produto atual;
        for (int i = 1; i < tamanho; i++) {
            atual = v[i];
            int j;
            for (j = i; (j > 0) && (atual.nome.compareTo(v[j - 1].nome) < 0); j--) {
                v[j] = v[j - 1];
            }
            v[j] = atual;
        }
    }

    static int buscaBinaria(Produto v[], int tamanho, String elem) {
        int inicio = 0, meio, fim = tamanho - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (elem.compareTo(v[meio].codigo) < 0) {
                fim = meio - 1;
            } else if (elem.compareTo(v[meio].codigo) > 0) {
                inicio = meio + 1;
            } else {
                return meio;
            }
        }
        return -1;
    }

    static void verDadosProduto(Produto p) {
        System.out.println("Dados do produto:");
        System.out.printf("Codigo: %s\n", p.codigo);
        System.out.printf("Nome: %s\n", p.nome);
        System.out.printf("Preço: %.2f\n", p.preco);
        System.out.printf("Estoque: %d\n", p.quantidadeEstoque);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanhoAtual = 0;
        Produto produtos[] = new Produto[20];
        int opcao;

        do {
            opcao = mostrarMenu();

            if (opcao == 1) {
                Produto p = cadastrarProduto();
                produtos[tamanhoAtual] = p;
                tamanhoAtual++;
                insertionSort(produtos, tamanhoAtual);
            } else if (opcao == 2) {
                listarProdutos(produtos, tamanhoAtual);
            } else if (opcao == 3) {
                System.out.print("Digite o codigo do produto: ");
                String codigo = entrada.next();
                int posicao = buscaBinaria(produtos, tamanhoAtual, codigo);
                if (posicao > -1) {
                    verDadosProduto(produtos[posicao]);
                } else {
                    System.out.println("Produto não encontrado");
                }
            }
        } while (opcao != 4);

        System.out.println("Saindo do sistema...");
    }

}
