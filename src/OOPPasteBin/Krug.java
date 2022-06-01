package OOPPasteBin;

public class Krug {
    private double precnik;
    private double poluprecnik;

    public Krug(double precnik) {
        this.precnik = precnik;
        this.poluprecnik = precnik / 2;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double obim() {
        return  Math.PI * 2* poluprecnik;
    }

    public double povrsina() {
        return Math.PI * (poluprecnik * poluprecnik);
    }
}
