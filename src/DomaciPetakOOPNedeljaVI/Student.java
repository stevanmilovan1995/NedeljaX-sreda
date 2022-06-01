package DomaciPetakOOPNedeljaVI;

public class Student {
    private String punoIme;
    private int brIndexa;
    private String smer;
    private double ocena1, ocena2,ocena3,ocena4,ocena5;
    private double sumaOcena;
    private double polozeniIspiti;

    public Student(String punoIme, int brIndexa, String smer, int ocena1, int ocena2, int ocena3, int ocena4, int ocena5) {
        this.punoIme = punoIme;
        this.brIndexa = brIndexa;
        this.smer = smer;
        this.ocena1 = ocena1;
        this.ocena2 = ocena2;
        this.ocena3 = ocena3;
        this.ocena4 = ocena4;
        this.ocena5 = ocena5;
        this.sumaOcena = ocena1 + ocena2 + ocena3 + ocena4 + ocena5;
        this.polozeniIspiti =  this.sumaOcena / 50 * 100;
    }

    public String daLijePolozio() {
        String poruka = "";
        if(this.polozeniIspiti > 50) {
            poruka = this.punoIme.concat(" je uspesno polozio ispit sa ").concat(String.valueOf(this.polozeniIspiti)).concat( "%.");
        }
        else {
            poruka = this.punoIme.concat(" nije uspeo da polozi ispit, jer za prolaz je potrebno preko 50% a on je imao ").concat(String.valueOf(this.polozeniIspiti)).concat("%.");
        }
        return poruka;
    }
}
