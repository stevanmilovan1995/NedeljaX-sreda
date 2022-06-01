package DomaciPetakOOPNedeljaVI;

public class StudentTest {
    public static void main(String[] args) {
        Student stevan = new Student("Stevan Milovanovic", 112, "Bogoslovsko-katihetski", 5, 5, 5, 4, 5);
        Student petar = new Student("Petar Peric", 121, "Prirodno-matematicki", 10, 3, 9, 2, 7);
        String poruka = petar.daLijePolozio();
        System.out.println(poruka);
    }



}
