package aula03_09.TAD.PlanoCartesiano;

public class PlanoCartesiano {
       Ponto pontos[] = new Ponto[10];

       void adicionarPonto(int indice, Ponto p) {
        pontos[indice] = p;
       }

       double calcularDistancia(Ponto p1, Ponto p2) {
        double diferencaEixoX = p2.x - p1.x;
        double diferencaEixoY = p2.y - p1.y;

        double resultado = Math.sqrt(
            Math.pow(diferencaEixoY, 2.0) + 
            Math.pow(diferencaEixoX, 2.0)
        );
        return resultado;
       }

       Ponto pegarPonto(int indice) {
        Ponto p = pontos[indice];
        return p;
       }
}
