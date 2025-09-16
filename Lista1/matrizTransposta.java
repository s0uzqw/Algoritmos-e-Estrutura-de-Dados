import java.util.Scanner;

public class matrizTransposta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o número de linhas: ");
        int linhas = entrada.nextInt();
        System.out.print("Informe o número de colunas: ");
        int colunas = entrada.nextInt();

        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        int[][] transposta = new int[colunas][linhas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }

        entrada.close();
    }
}
