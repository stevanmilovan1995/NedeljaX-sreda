package OOPPredavanje;

public class Test {
    public static void main(String[] args) {
        Covek stevan = new Covek("Stevan", "Milovanovic", 1995, 5, true);
        Automobil audi = new Automobil(stevan,"Audi", "A6", 2016, 5, 4,true);

        System.out.println(audi.ispis());

        System.out.println(stevan.getIme());
        System.out.println(audi.getVlasnik().getGodinaRodjenja());
        audi.getVlasnik().setIme("Ivan");
        System.out.println(audi.getVlasnik().getIme());

    }
}
