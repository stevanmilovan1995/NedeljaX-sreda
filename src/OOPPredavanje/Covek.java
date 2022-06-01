package OOPPredavanje;

public class Covek {
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private int godineIskustvaUVoznji;
    private boolean jeDobarVozac;

    public Covek(String ime, String prezime, int godinaRodjenja, int godineIskustvaUVoznji, boolean jeDobarVozac) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.godineIskustvaUVoznji = godineIskustvaUVoznji;
        this.jeDobarVozac = jeDobarVozac;
    }

    public Covek() {
        this.ime = "";
        this.prezime = "";
        this.godinaRodjenja = 0;
        this.godineIskustvaUVoznji = 0;
        this.jeDobarVozac = true;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public int getGodineIskustvaUVoznji() {
        return godineIskustvaUVoznji;
    }

    public void setGodineIskustvaUVoznji(int godineIskustvaUVoznji) {
        this.godineIskustvaUVoznji = godineIskustvaUVoznji;
    }

    public boolean isJeDobarVozac() {
        return jeDobarVozac;
    }

    public void setJeDobarVozac(boolean jeDobarVozac) {
        this.jeDobarVozac = jeDobarVozac;
    }

    public String ispis() {
        String str = ime.concat(" ").concat(prezime).concat("\n");
        str = str.concat("Godina rodjenja: ").concat(String.valueOf(godinaRodjenja)).concat("\n");
        str = str.concat("Ovaj vozac ima ").concat(String.valueOf(godineIskustvaUVoznji)).concat(" godina iskustva u voznji. \n");
        str = str.concat(jeDobarVozac ? "Jeste dobar vozac." : "Nije dobar vozac");
        return str;
    }
}
