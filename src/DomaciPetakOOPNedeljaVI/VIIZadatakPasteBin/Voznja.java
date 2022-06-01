package DomaciPetakOOPNedeljaVI.VIIZadatakPasteBin;



public class Voznja {
    public static void main(String[] args) {
        Automobil audi = new Automobil("Audi", "A6", 126589, "Petar Petrovic");
        System.out.println(audi.getMarka());
        System.out.println("Marka ovog automobila je ".concat(audi.getMarka()).concat(" a model je: ".concat(audi.getModel())));
        System.out.println("Stari vlasnik automobila je ".concat(audi.getVlasnik()).concat(" , sa serijskim brojem automobila ".concat(String.valueOf(audi.getSerijskiBroj()))));
        audi.setVlasnik("Ivan Nikolic");
        System.out.println("Novi vlasnik automobila je ".concat(audi.getVlasnik()).concat(" , sa serijskim brojem automobila ".concat(String.valueOf(audi.getSerijskiBroj()))));

    }
}
