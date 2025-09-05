package TV;

public class TV {
    boolean status;
    int volume = 0;
    int canal = 0;

    public void statusLigada() {
        this.status = true;
        System.out.println("\nA TV foi ligada.\n");
    }

    public void statusDesligada() {
        this.status = false;
        System.out.println("\nA TV foi desligada.\n");
    }

    public int aumentarVolume() {
        this.volume += 1;
        return volume;
    }

    public int diminuirVolume() {
        this.volume -= 1;
        return volume;
    }

    public int aumentarCanal() {
        this.canal += 1;
        return canal;
    }

    public int diminuirCanal() {
        this.canal -= 1;
        return canal;
    }

    public void mostrarInfos() {
        
    }
}
