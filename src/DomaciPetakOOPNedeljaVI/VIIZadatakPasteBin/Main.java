package DomaciPetakOOPNedeljaVI.VIIZadatakPasteBin;

public class Main {
    public static void main(String[] args) {
        Sportista sinisa = new Sportista("Sinisa Mihajlovic", "fudbal", "Lazio", 11);
        Sportista totti = new Sportista("Francesco Totti", "fudbal", "Roma", 10);
        Sportista jokic = new Sportista("Nikola Jokic", "kosarka", "Denver",  15);

        System.out.println("Ime i prezime sportiste je: " + sinisa.getImeIPrezime() + " koji se bavio " + sinisa.getSport() + "om. Igrao je za klub " + sinisa.getKlub() + " i nosio dres sa brojem " + sinisa.getBrojNaDresu() + ".");

        System.out.println("Ime i prezime sportiste je: " + jokic.getImeIPrezime() + " koji se bavio " + jokic.getSport() + "om. Igrao je za klub " + jokic.getKlub() + " i nosio dres sa brojem " + jokic.getBrojNaDresu() + ".");
        jokic.setKlub("Vizura");
        jokic.setBrojNaDresu(25);
        System.out.println("Ime i prezime sportiste je: " + jokic.getImeIPrezime() + " koji se bavio " + jokic.getSport() + "om. Igrao je za klub " + jokic.getKlub() + " i nosio dres sa brojem " + jokic.getBrojNaDresu() + ".");
        System.out.println("Ime i prezime sportiste je: " + totti.getImeIPrezime() + " koji se bavio " + totti.getSport() + "om. Igrao je za klub " + totti.getKlub() + " i nosio dres sa brojem " + totti.getBrojNaDresu() + ".");
        totti.setKlub("penzionisan");
        System.out.println("Ime i prezime sportiste je: " + totti.getImeIPrezime() + " koji se bavio " + totti.getSport() + "om. Trenutno je " + totti.getKlub() + ".");

    }
}
