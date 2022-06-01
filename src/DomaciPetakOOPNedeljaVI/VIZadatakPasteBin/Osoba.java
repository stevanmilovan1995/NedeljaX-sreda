package DomaciPetakOOPNedeljaVI.VIZadatakPasteBin;

public class Osoba {
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private boolean daLiJePisac;

    public Osoba(String ime, String prezime, int godinaRodjenja, boolean daLiJePisac) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.daLiJePisac = daLiJePisac;
    }

    public Osoba() {
        this.ime = "";
        this.prezime = "";
        this.godinaRodjenja = 0;
        this.daLiJePisac = false;
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

    public boolean isDaLiJePisac() {
        return daLiJePisac;
    }

    public void setDaLiJePisac(boolean daLiJePisac) {
        this.daLiJePisac = daLiJePisac;
    }


    public String autorIspis() {
        StringBuilder str = new StringBuilder(100);
        if (this.ime.equals("")) {
            str.append("Autor knjige je nepoznat." );
        }
        else
            str.append("Autor knjige je: " + this.ime + " " + this.prezime);
        return str.toString();
    }

    public String vlasnikIspis() {
        StringBuilder str = new StringBuilder(100);
        if (this.ime.equals("")) {
            str.append("Knjiga nema vlasnika.");
        }
        else
            str.append("Vlasnik knjige je: " + this.ime + " " + this.prezime);
        return str.toString();
    }
}
