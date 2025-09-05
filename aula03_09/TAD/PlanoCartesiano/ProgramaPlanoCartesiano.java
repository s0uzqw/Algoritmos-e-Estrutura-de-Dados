package PlanoCartesiano;

public class ProgramaPlanoCartesiano {
    public static void main(String[] args) {
        PlanoCartesiano pc = new PlanoCartesiano();
        Ponto p1 = new Ponto();
        p1.x = 3;
        p1.y = 2;
        pc.adicionarPonto(0, p1);
        Ponto p2 = new Ponto();
        p2.x = 6;
        p2.y = 5;
        pc.adicionarPonto(1, p2);
        double distancia = pc.calcularDistancia(p1, p2);
        System.out.printf("Distancia entre dois pontos %.2f\n", distancia);
    }
}
