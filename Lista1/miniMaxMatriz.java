import java.util.Scanner;

public class miniMaxMatriz {
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

        int maior = matriz[0][0];
        int linhaMaior = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                }
            }
        }

        int minimax = matriz[linhaMaior][0];
        for (int j = 1; j < colunas; j++) {
            if (matriz[linhaMaior][j] < minimax) {
                minimax = matriz[linhaMaior][j];
            }
        }

        System.out.println("Elemento minimax = " + minimax);
        entrada.close();
    }
}
