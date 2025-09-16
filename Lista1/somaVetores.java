import java.util.Scanner;

public class somaVetores {
    
    public static int[] carregarVetor(Scanner entrada, int tamanho, String nome) {
        int[] vetor = new int[tamanho];
        System.out.println("Digite os valores do vetor " + nome + ":");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = entrada.nextInt();
        }
        return vetor;
    }

    public static int[] somarVetores(int[] v1, int[] v2) {
        int[] resultado = new int[v1.length];
        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i] + v2[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] A = carregarVetor(entrada, 5, "A");
        int[] B = carregarVetor(entrada, 5, "B");
        int[] C = carregarVetor(entrada, 5, "C");
        int[] D = carregarVetor(entrada, 5, "D");

        int[] somaAB = somarVetores(A, B);
        int[] somaABC = somarVetores(somaAB, C);
        int[] somaABCD = somarVetores(somaABC, D);

        System.out.print("A + B + C + D = [");
        for (int i = 0; i < somaABCD.length; i++) {
            System.out.print(somaABCD[i]);
            if (i < somaABCD.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        entrada.close();
    }
}
