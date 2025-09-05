package aula03_09.TAD.Cubo;

public class ProgramaCubo {
    public static void main(String[] args) {
        CalculoCubo ccb = new CalculoCubo();

        int area = ccb.calcularArea(3);
        int volume = ccb.calcularVolume(3);
        int lado = ccb.calcularLado(3);

        System.out.printf("A área do cubo é: %d\n", area);

        System.out.printf("A volume do cubo é: %d\n", volume);

        System.out.printf("O tamanho de cada lado do cubo é: %d", lado);


    }
}
