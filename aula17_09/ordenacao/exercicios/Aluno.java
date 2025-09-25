package aula17_09.ordenacao.exercicios;

public class Aluno {
    String nome;
    double notas[] = new double[4];

    void atribuirNota(double valor, int posicao) {
        notas[posicao] = valor;
    }

    void mostrarNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota[%d]: %.2f\n", i + 1, notas[i]);
        }
    }

    double calcularMedia() {
        double soma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    void mostrarMedia() {
        System.out.printf("MÃŠdia: %.2f\n", calcularMedia());
    }
}