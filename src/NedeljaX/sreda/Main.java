package NedeljaX.sreda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sastojak jaje = new Sastojak("Jaje", 12.5);
        Sastojak spagete = new Sastojak("Spagete", 120);
        Sastojak pavlaka = new Sastojak("Pavlaka za kuvanje", 143);
        Sastojak luk = new Sastojak("Beli luk", 14.25);
        Sastojak meso = new Sastojak("Curetina", 78);
        Sastojak maslac = new Sastojak("Maslac", 36);
        Sastojak biber = new Sastojak("Biber", 4.22);
        Sastojak so = new Sastojak("So", 2.33);
        Sastojak kecap = new Sastojak("Kecap", 50);
        ArrayList<SastojakRecepata> sviSastojci = new ArrayList<>();
        SastojakRecepata jaja = new SastojakRecepata(jaje.getImeSastojka(), jaje.getCenaSastojka(), 2);
        sviSastojci.add(jaja);
        sviSastojci.add(new SastojakRecepata(spagete.getImeSastojka(), spagete.getCenaSastojka(), 1));
        sviSastojci.add(new SastojakRecepata(pavlaka.getImeSastojka(), pavlaka.getCenaSastojka(), 1));
        sviSastojci.add(new SastojakRecepata(luk.getImeSastojka(), luk.getCenaSastojka(), 0.43));
        sviSastojci.add(new SastojakRecepata(meso.getImeSastojka(), meso.getCenaSastojka(), 11.23));
        sviSastojci.add(new SastojakRecepata(maslac.getImeSastojka(), maslac.getCenaSastojka(), 0.75));
        sviSastojci.add(new SastojakRecepata(biber.getImeSastojka(), biber.getCenaSastojka(), 0.124));
        sviSastojci.add(new SastojakRecepata(so.getImeSastojka(), so.getCenaSastojka(), 2));
        Recept spageteUSosu = new Recept("Spagete u belom sosu", 3, sviSastojci);
        System.out.println(spageteUSosu);
        spageteUSosu.ukloniSastojak(jaja);
        System.out.println(spageteUSosu);
        spageteUSosu.dodajSastojak(jaja);
        System.out.println(spageteUSosu);
        System.out.println(jaje.getImeSastojka());
        System.out.println(jaja.getKolicinaSastojka());
        spageteUSosu.skaliranje(spageteUSosu, 50);
        System.out.println(spageteUSosu);
    }
}
