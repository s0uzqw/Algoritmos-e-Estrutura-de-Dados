public class QuickSort {

    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(array, inicio, fim);

            quickSort(array, inicio, indicePivo - 1);

            quickSort(array, indicePivo + 1, fim);
        }
    }

    private static int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];

        int i = (inicio - 1);

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;

                trocar(array, i, j);
            }
        }

        trocar(array, i + 1, fim);

        return i + 1;
    }

    private static void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
