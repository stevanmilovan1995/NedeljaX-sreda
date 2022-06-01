package OOPPasteBin;

public class Osoba {
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private int visina;

    public Osoba(String ime, String prezime, int godinaRodjenja, int visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.visina = visina;
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

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    @Override
    public String toString() {
        return "Ime osobe je : "
                + ime + ". " +
                " Prezime osobe je : " + prezime + ". " +
                " Godina rodjenja osobe je : " + godinaRodjenja + ". " +
                " Visina osobe je : " + visina + ". " ;
    }
}
