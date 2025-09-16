package aula15_09.ordenacao.selectionsort;

public class SellectionSortExemplo1 {

    static void troca(int v[], int atual, int proximo) {
        int aux = v[atual];
        v[atual] = v[proximo];
        v[proximo] = aux;
    }

    public static void selectionSort(int v[]) {
        int menor;
        for (int i = 0; i < v.length; i++) {
            menor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }
            if (i != menor) {
                troca(v, i, menor);
            }
        }
    }
}