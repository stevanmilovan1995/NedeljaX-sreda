package OOPPasteBin;

public class Pravougaonik {
    private double sirina;
    private double visina;

    public Pravougaonik(double sirina, double visina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double obim() {
        return 2 * this.sirina + 2 * this.visina;
    }

    public double povrsina() {
        return this.sirina * this.visina;
    }

    @Override
    public String toString() {
        return "Pravougaonik sirine " + sirina +
                " i visine " + visina +
                " ima: " + " Obim : " + obim() + " , Povrsinu : " + povrsina();
    }
}
