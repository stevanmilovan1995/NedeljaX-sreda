package OOPPredavanje;

public class Automobil {
    private Covek vlasnik;
    private String marka;
    private String model;
    private int godinaProizvodnje;
    private int brojVrata;
    private int brojTockova;
    private boolean daLijeSportski;
    private static int brojAutomobila;
    private int serijskiBroj;

    private void postaviSerijski() {
        brojAutomobila++;
        this.serijskiBroj = brojAutomobila;
    }

    public Automobil(Covek vlasnik, String marka, String model, int godinaProizvodnje, int brojVrata, int brojTockova, boolean daLijeSportski) {
        this.vlasnik = new Covek(vlasnik.getIme(), vlasnik.getPrezime(), vlasnik.getGodinaRodjenja(), vlasnik.getGodineIskustvaUVoznji(), vlasnik.isJeDobarVozac());
        this.marka = marka;
        this.model = model;
        this.godinaProizvodnje = godinaProizvodnje;
        this.brojVrata = brojVrata;
        this.brojTockova = brojTockova;
        this.daLijeSportski = daLijeSportski;
        postaviSerijski();
    }

    public Automobil() {
        this.vlasnik = new Covek();
        this.marka = "";
        this.model = "";
        this.godinaProizvodnje = 0;
        this.brojVrata = 0;
        this.brojTockova = 0;
        this.daLijeSportski = false;
        postaviSerijski();
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public int getBrojTockova() {
        return brojTockova;
    }

    public void setBrojTockova(int brojTockova) {
        this.brojTockova = brojTockova;
    }

    public boolean isDaLijeSportski() {
        return daLijeSportski;
    }

    public void setDaLijeSportski(boolean daLijeSportski) {
        this.daLijeSportski = daLijeSportski;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public Covek getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Covek vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String ispis() {
        String opis = "Marka ovog automobila je: ".concat(this.marka).concat("\n");
        opis = opis.concat("Model automobila je: ").concat(this.model).concat("\n");
        opis = opis.concat(this.vlasnik.ispis()).concat("\n");
        opis = opis.concat("Godina proizvodnje je: ").concat(String.valueOf(this.godinaProizvodnje)).concat("\n");
        opis = opis.concat("Auto ima ".concat(String.valueOf(this.brojVrata)).concat(" vrata. \n"));
        opis = opis.concat("Takodje i poseduje ".concat(String.valueOf(this.brojTockova).concat(" tockova. \n")));
        opis = opis.concat(this.daLijeSportski ? "Auto je sportski." : "Auto nije sportski.").concat("\n");
        opis = opis.concat("Serijski broj ovog automobila je ").concat(String.valueOf(this.serijskiBroj)).concat(".\n");
        return opis;
    }
}
