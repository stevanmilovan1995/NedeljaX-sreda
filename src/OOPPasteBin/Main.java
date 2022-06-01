package OOPPasteBin;

public class Main {
    public static void main(String[] args) {
        Osoba stevan = new Osoba("Stevan", "Milovanovic", 1995, 178);
        String poruka = stevan.toString();
        System.out.println(poruka);

        Pravougaonik pravougaonik = new Pravougaonik(10, 10);
        System.out.println(pravougaonik);
//        System.out.println(poruka2);

        Krug krug = new Krug(6);
        double obimKruga = krug.obim();
        double povrsinaKruga = krug.povrsina();
        System.out.println(obimKruga);
        System.out.println(povrsinaKruga);
    }
}
