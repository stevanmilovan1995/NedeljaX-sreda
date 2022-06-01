package NedeljaX.sreda;

public class Sastojak {
    private String imeSastojka;
    private double cenaSastojka;

    public Sastojak(String imeSastojka, double cenaSastojka) {
        this.imeSastojka = imeSastojka;
        this.cenaSastojka = cenaSastojka;
    }

    public Sastojak() {
    }

    public String getImeSastojka() {
        return imeSastojka;
    }

    public void setImeSastojka(String imeSastojka) {
        this.imeSastojka = imeSastojka;
    }

    public double getCenaSastojka() {
        return cenaSastojka;
    }

    public void setCenaSastojka(double cenaSastojka) {
        this.cenaSastojka = cenaSastojka;
    }


}
