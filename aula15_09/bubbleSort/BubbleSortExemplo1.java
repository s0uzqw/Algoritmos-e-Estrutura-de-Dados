package aula15_09.bubbleSort;

public class BubbleSortExemplo1 {

    public static void troca(int v[], int atual, int proximo) {
        int aux = v[atual];
        v[atual] = v[proximo];
        v[proximo] = aux;
    }

    public static void bubbleSort(int v[]) {
        int continua, fim;
        fim = v.length;
        do {
            continua = 0;
            for (int i = 0; i < fim - 1; i++) {
                if (v[i] > v[i + 1]) {
                    troca(v, i, i + 1);
                    continua = i;
                }
            }
            fim--;
        } while (continua != 0);
    }

}
