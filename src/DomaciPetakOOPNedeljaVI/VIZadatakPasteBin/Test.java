package DomaciPetakOOPNedeljaVI.VIZadatakPasteBin;

public class Test {
    public static void main(String[] args) {
        Osoba dostojevski = new Osoba("Fjodor", "Dostojevski", 1821, true);
        Osoba andric = new Osoba("Ivo", "Andric", 1892, true);
        Osoba stevan = new Osoba("Stevan", "Milovanovic", 1995, false);
        Osoba niko = new Osoba();

        Knjiga bracKaramazov = new Knjiga("Braca Karamazov", dostojevski, -15, -10);
        Knjiga prokletaAvlija = new Knjiga("Prokleta Avlija", andric, stevan, 85, 2014);

        String poruka = bracKaramazov.ispis();
        System.out.println(poruka);
        System.out.println("-----------------------");
        String poruka2 = prokletaAvlija.fullIspis();
        System.out.println(poruka2);


//        String poruka2 = prokletaAvlija.fullIspis();
//        System.out.println(poruka2);
    }




}
