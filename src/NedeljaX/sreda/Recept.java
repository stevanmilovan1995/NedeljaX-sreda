package NedeljaX.sreda;

import java.util.ArrayList;

public class Recept {
    private String nazivRecepta;
    private int tezinaRecepta;
    private ArrayList<SastojakRecepata> sastojak;

    public Recept(String nazivRecepta, int tezinaRecepta, ArrayList<SastojakRecepata> sastojak) {
        this.nazivRecepta = nazivRecepta;
        this.tezinaRecepta = tezinaRecepta;
        this.sastojak = sastojak;
    }

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        this.nazivRecepta = nazivRecepta;
    }

    public int getTezinaRecepta() {
        return tezinaRecepta;
    }

    public void setTezinaRecepta(int tezinaRecepta) {
        this.tezinaRecepta = tezinaRecepta;
    }

    public ArrayList<SastojakRecepata> getSastojak() {
        return sastojak;
    }

    public void setSastojak(ArrayList<SastojakRecepata> sastojak) {
        this.sastojak = sastojak;
    }

    public void dodajSastojak(SastojakRecepata namirnica) {
        sastojak.add(namirnica);
    }

    public boolean provera(SastojakRecepata s, SastojakRecepata s2) {
        return s.getImeSastojka().equals(s2.getImeSastojka()) && s.getCenaSastojka() == s2.getCenaSastojka();
    }

    public void ukloniSastojak(SastojakRecepata namirnica) {
        for (int i = 0; i < sastojak.size(); i++) {
            SastojakRecepata trenutni = sastojak.get(i);
            if (provera(trenutni, namirnica)) {
                sastojak.remove(i);
                return;
            }
        }
    }

    public String tezinaRecepta() {
        String poruka = "";
        if (tezinaRecepta == 1) {
            poruka = "Pocetni nivo";
        } else if (tezinaRecepta == 2) {
            poruka = "Lak recept";
        } else if (tezinaRecepta == 3) {
            poruka = "Srednji nivo";
        } else if (tezinaRecepta == 4) {
            poruka = "Tezak nivo";
        } else if (tezinaRecepta == 5) {
            poruka = "Majstoriski nivo";
        } else {
            poruka = "Uneta tezina je nepostojeca!";
        }
        return poruka;
    }

    public double cenaRecepta() {
        double suma = 0;
        for (SastojakRecepata sastojakRecepata : sastojak) {
            suma += sastojakRecepata.ukupnaCena();
        }
        return suma;
    }

//    public static Recept skaliraj (Recept r ,double x){
//        double y =100 / x;
//        Recept q = new Recept(r.getNaziv(),r.getTezina(),r.getSastojci());
//        for (SastojakRecepta s : q.getSastojci()){
//            s.setCena(s.getCena() / y);
//        }
//        return q;
//    }

    public Recept skaliranje(Recept r, double x) {
        double procenat = 100 / x;
        Recept skaliran = new Recept(r.getNazivRecepta(), r.getTezinaRecepta(), r.getSastojak());
        for (SastojakRecepata s : skaliran.getSastojak()) {
            s.setCenaSastojka(s.getCenaSastojka() / procenat);
        }
        return skaliran;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nazivRecepta).append(": \n");
        sb.append("Tezina: ").append(tezinaRecepta()).append("\n");
        sb.append("Sastojci: \n");
        for (SastojakRecepata sastojakRecepata : sastojak) {
            sb.append(sastojakRecepata.getImeSastojka()).append("\n");
        }
        sb.append("Ukupna cena recepta ").append("'").append(nazivRecepta).append("'").append(" je: ").append(Math.round(cenaRecepta())).append(" dinara.\n");
        return sb.toString();
    }






}
