package aula25_09.busca.linear;

public class Exemplo1 {
    static int buscaLinear(int v[], int valor) {
        int tamanhoVetor = v.length;
        for (int i = 0; i < tamanhoVetor; i++) {
            if (valor == v[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numeros[] = {23,4,64,-8,54,90,21};
        int chaveBusca = 54;
        int posicao = buscaLinear(numeros, chaveBusca);
        if (posicao > -1) {
            System.out.printf("Dado encontrado no indice %d\n", posicao);
        } else {
            System.out.println("Dado não encontrado!");
        }
    }
}
