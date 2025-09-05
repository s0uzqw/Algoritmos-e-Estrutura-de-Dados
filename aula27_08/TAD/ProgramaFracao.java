package aula27_08.TAD;

import java.util.Scanner;

public class ProgramaFracao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Criação do objeto da classe Fracao
        Fracao f1 = new Fracao();

        System.out.println("Digite o numerador: ");
        f1.numerador = entrada.nextInt();

        System.out.println("Digite o dividor: ");
        f1.divisor = entrada.nextInt();

        int resultado = f1.obterResultado();

        System.out.printf("Resultado: %d\n", resultado);

        entrada.close();
    }
}