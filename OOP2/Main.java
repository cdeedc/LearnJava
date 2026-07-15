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

                Profesor prof1 = new Profesor("Stefan", "Alex", 10000.0d);
                System.out.println(prof1.nume);
                System.out.println(prof1.prenume);
                prof1.afisareSalariu();
                System.out.println();

                // Clasa
                Elev[] elevi = { e, e1, e2 };
                Nivel nivel = Nivel.XI;
                Litera litera = Litera.C;
                Clasa clasa = new Clasa(prof1, elevi, nivel, litera);
                clasa.afisare();
	}
}