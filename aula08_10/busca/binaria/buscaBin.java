package aula08_10.busca.binaria;

public class buscaBin {

    static int buscaBinaria(int v[], int elem) {
        int inicio = 0, meio, fim = v.length - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (elem < v[meio]) {
                fim = meio - 1; // buscar pela metade a esquerda
            } else if (elem > v[meio]) {
                inicio = meio + 1; // buscar pela metade a direita
            } else {
                return meio;
            }
        }
        return -1; // elemento não encontrado
    }

    public static void main(String[] args) {
        int numeros[] = { -8, -5, 1, 4, 14, 21, 23, 54, 68, 90 }; 
        int valorASerEncontrado = 4;
        int indice = buscaBinaria(numeros, valorASerEncontrado);
        if (indice > -1) {
            System.out.printf("Valor encontrado no indice %d", indice);
        } else {
            System.out.println("Valor não encontrado");
        }
    }
    
} 