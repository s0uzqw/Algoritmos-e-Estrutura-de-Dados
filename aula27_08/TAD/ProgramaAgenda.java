package aula27_08.TAD;

import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Preencha os dados do contato");

        // int numeros[] = new int[15];
        // numeros[0] = 1;
        Contato c1 = new Contato();
        // atribuindo valores aos atributos do objeto da classe Contato
        c1.nome = entrada.next();
        c1.celular = entrada.next();
        c1.email = entrada.next();

        // acessando os dados dos atributos objeto Contato
        System.out.printf("Nome do contato: %s\n", c1.nome);
        System.out.printf("Número do celular: %s\n", c1.celular);
        System.out.printf("Email do contato: %s\n", c1.email);

        entrada.close();
    }
}