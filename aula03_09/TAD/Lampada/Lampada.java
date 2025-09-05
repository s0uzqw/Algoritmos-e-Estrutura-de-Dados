package aula03_09.TAD.Lampada;

public class Lampada {
    boolean status;

    public void statusLigado() {
        this.status = true;
        System.out.println("A lampada foi ligada.\n");
    }

    public void statusDesligado() {
        this.status = false;
        System.out.println("A lampada foi desligada.\n");
    }

    public void mostrarStatus() {
        if (status == true) {
            System.out.println("A lampada está ligada.\n");
        } else {
            System.out.println("A lampada está desligada.\n");
        }
    }

    public void lampada1() {

    }

    public void lampada2() {

    }
}