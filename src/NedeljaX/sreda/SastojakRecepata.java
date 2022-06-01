package NedeljaX.sreda;

public class SastojakRecepata extends Sastojak{
    private double kolicinaSastojka;

    public SastojakRecepata(String imeSastojka, double cenaSastojka, double kolicinaSastojka) {
        super(imeSastojka, cenaSastojka);
        this.kolicinaSastojka = kolicinaSastojka;
    }

    public SastojakRecepata(double kolicinaSastojka) {
        this.kolicinaSastojka = kolicinaSastojka;
    }

    public double getKolicinaSastojka() {
        return kolicinaSastojka;
    }

    public void setKolicinaSastojka(double kolicinaSastojka) {
        this.kolicinaSastojka = kolicinaSastojka;
    }

    public double ukupnaCena() {
        return super.getCenaSastojka() * this.kolicinaSastojka;
    }


}
