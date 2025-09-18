package aula17_09.ordenacao.insertionSort;

public class insertionSortExemplo1 {
    public static void insertionSort(int v[]) {
        int atual;
        for (int i = 1; i < v.length; i++) {
            atual = v[i];
            int j;
            for (j = i; (j > 0) && (atual < v[j - 1]); j--) {
                v[j] = v[j - 1];
            }
            v[j] = atual;
        }
    }

    public static void main(String[] args) {
        int vetor[] = { 23, 4, 67, -8, 21 };
        insertionSort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
