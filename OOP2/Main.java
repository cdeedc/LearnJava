// Extended version
public class Main {
    public static void main(String[] args) {
        // Persoana
        Persoana p = new Persoana("Ion", "Ion");
        p.afisare();

        // Elev
        Elev e = new Elev();
        e.afisare();
        e.nume = "Zamfir";
        e.prenume = "Dan";
        e.setMedieAnuala(9.85);

        Elev e1 = new Elev("Ion");
        e1.afisare();
        e1.nume = "Pop";
        e1.prenume = "Mihai";
        e1.setMedieAnuala(9.53d);

        Elev e2 = new Elev("Popescu", "Alex", 9.95d);
        e2.afisareMedieAnuala();
        System.out.println(e2.getMedieAnuala() + "\n");

        // Profesor
        Profesor prof = new Profesor("Popescu");
        System.out.println(prof.nume + "\n");
        prof.nume = "Costel";
        prof.setSalariu(10050.d);

        Profesor prof1 = new Profesor("Stefan", "Alex", 10000.0d);
        System.out.println(prof1.nume);
        System.out.println(prof1.prenume);
        prof1.afisareSalariu();
        System.out.println();

        // Clasa
        Elev[] elevi = { e, e1, e2 };
        Clasa clasa = new Clasa(prof1, elevi, Nivel.XI, Litera.C);
        clasa.afisare();

        Clasa clasa2 = new Clasa(prof, elevi, Nivel.IX, Litera.A);
        clasa2.afisare();
        System.out.println();

        // Scoala
        Clasa[] clase = new Clasa[16];
        int idx = 0;
        for(Nivel nivel : Nivel.values()) {
            for(Litera litera : Litera.values()) {
                Clasa cls = new Clasa(prof, elevi, nivel, litera);
                clase[idx] = cls;
                idx++;    
            }
        }
        Profesor[] profs = { prof, prof1 };
        String adr = "Str. Egalitatii";
        Scoala scoala = new Scoala(profs, clase, prof, adr, "Colegiul National \"Zinca Golescu\"");
        scoala.afisare();
    }
}