import java.util.Scanner;

public class vetorIndice {
    public static int[] processarVetor(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                B[i] = A[i] * 5;
            } else {
                B[i] = A[i] + 5;
            }
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor: ");
        int n = entrada.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = entrada.nextInt();
        }
        int[] B = processarVetor(A);
        System.out.print("Vetor B = [");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]);
            if (i < B.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        entrada.close();
    }
}
