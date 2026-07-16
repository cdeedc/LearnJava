package OOP2;

public class Oras {
    public Scoala[] scoli;
    public String nume;

    public Oras(Scoala[] scl, String n) {
        scoli = scl;
        nume = n;
    }

    public void afisare() {
        System.out.println("==============================================");
        System.out.println(">>>>>>>>>> Orasul " + nume + "<<<<<<<<<<<<<");

        System.out.println("Scoli componente:\n");
        for(Scoala scoala : scoli)
            if(scoala != null)
                scoala.afisare();

        System.out.println("==============================================");
    }
}