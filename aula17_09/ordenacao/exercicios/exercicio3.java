package aula17_09.ordenacao.exercicios;

import java.util.Scanner;

public class exercicio3 {

    static void lerAlunos(Aluno v[]) {
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++) {
            Aluno aluno = new Aluno();
            System.out.printf("Digite o nome do aluno: %d", i + 1);
            String nome = entrada.nextLine();
            
            System.out.println("Digite as 4 notas do aluno");
            for(int j = 0; j < 4; j++) {
                double nota = entrada.nextDouble();
                aluno.atribuirNota(nota, i);
            }
            entrada.nextLine();
        }
        entrada.close();
    }

    public static void main(String[] args) {
        
}
