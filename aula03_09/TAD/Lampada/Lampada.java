package Lampada;
public class Lampada {
    boolean status;

    public void statusLigada() {
        this.status = true;
        System.out.println("\nA lampada foi ligada.\n");
    }

    public void statusDesligada() {
        this.status = false;
        System.out.println("\nA lampada foi desligada.\n");
    }

    public void mostrarStatus() {
        System.out.printf("A lampada 1 está %s\n", status ? "Ligada" : "Desligada");
        System.out.printf("A lampada 2 está %s\n", !status ? "Ligada" : "Desligada");
    }
}