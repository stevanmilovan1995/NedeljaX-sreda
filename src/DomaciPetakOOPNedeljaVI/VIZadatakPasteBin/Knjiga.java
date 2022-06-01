package DomaciPetakOOPNedeljaVI.VIZadatakPasteBin;


public class Knjiga {
    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = new Osoba(autor.getIme(), autor.getPrezime(), autor.getGodinaRodjenja(), autor.isDaLiJePisac());
        this.vlasnik = new Osoba(vlasnik.getIme(), vlasnik.getPrezime(), vlasnik.getGodinaRodjenja(), vlasnik.isDaLiJePisac());
        if (brojStrana < 0) {
            this.brojStrana = 0;
            System.out.println("Ne mozete uneti negativan broj stranica.");
        } else {
            this.brojStrana = brojStrana;
        }
        if (this.godinaIzdanja < 0) {
            this.godinaIzdanja = 0;
            System.out.println("Ne mozete uneti negativnu godinu izdanja.");

        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public Knjiga(String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        if (brojStrana < 0) {
            System.out.println("Ne mozete uneti negativan broj stranica.");
            this.brojStrana = 0;
        } else {
            this.brojStrana = brojStrana;
        }
        if (godinaIzdanja < 0) {
            this.godinaIzdanja = 0;
            System.out.println("Ne mozete uneti negativnu godinu izdanja.");

        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }


    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        if (brojStrana < 0) {
            this.brojStrana = 0;
            System.out.println("Ne mozete uneti negativan broj stranica.");
        } else {
            this.brojStrana = brojStrana;
        }

    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if (godinaIzdanja < 0) {
            this.godinaIzdanja = 0;
            System.out.println("Ne mozete uneti negativnu godinu izdanja.");
        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }



    public String fullIspis() {
        StringBuilder str = new StringBuilder(1000);
        str.append("Naziv knjige je: " + this.getNazivKnjige() + "\n");
        str.append(autor.autorIspis() + "\n");
        str.append(vlasnik.vlasnikIspis() + "\n");
        str.append("Broj strana: " + this.brojStrana + "\n");
        str.append("Godina izdanja: " + this.godinaIzdanja + "\n");
        str.append(velicinaKnjige());
        return str.toString();
    }


    public String ispis() {
        StringBuilder str = new StringBuilder(1000);
        str.append("Naziv knjige je: " + this.getNazivKnjige() + "\n");
        str.append(autor.autorIspis() + "\n");
        str.append("Broj strana: " + this.brojStrana + "\n");
        str.append("Godina izdanja: " + this.godinaIzdanja + "\n");
        str.append(velicinaKnjige());
        return str.toString();
    }

    public String velicinaKnjige() {
        String str = "";
        if (this.brojStrana >= 0 && this.brojStrana <= 100) {
            str = "Mala knjiga";
        } else if (this.brojStrana >= 101 && this.brojStrana <= 300) {
            str = "Srednje velika knjiga";
        } else if (this.brojStrana >= 301 && this.brojStrana <= 600) {
            str = "Velika knjiga";
        } else if (this.brojStrana > 600) {
            str = "Bas velika knjiga";
        } else {
            str = "Ne mozete uneti negativan broj strana.";
        }
        return str;
    }
}
