import java.util.Scanner;

public class Contador {
    Scanner entrada = new Scanner(System.in);

    int valorInit = 0;

    public void inserirValor() {
        System.out.println("Digite o valor inicial: ");
        valorInit = entrada.nextInt();
    }

    public void incrementar() {
        System.out.println("Digite o valor a ser incrementado: ");
        int inc = entrada.nextInt();

        valorInit += inc;
    }

    public void decrementar() {
        System.out.println("Digite o valor a ser decrementado: ");
        int dec = entrada.nextInt();

        valorInit -= dec;
    }

    public void obterValor() {
        System.out.printf("O valor obtido é: %d", valorInit);
    }
}