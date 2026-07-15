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
        char litera = 'C';
        int nivel = 11;
        Clasa clasa = new Clasa(prof1, elevi, litera, nivel);
        clasa.afisare();
	}
}

class Persoana {
    public String nume;
    public String prenume;

    Persoana() {
        nume = "";
        prenume = "";
    }

    Persoana(String n) {
        nume = n;
        prenume = "";
    }

    Persoana(String n, String p) {
        nume = n;
        prenume = p;
    }

    public void afisare() {
        System.out.println(nume + " " + prenume);
    }
}

class Elev extends Persoana {
    private double medieAnuala;
    
    public Elev() {
        super();
        medieAnuala = 0.0d;
    }
    
    public Elev(String n) {
        super(n);
    }

    public Elev(String n, String p) {
        super(n, p);
    }

    public Elev(String n, String p, double m) {
        super(n, p);
        medieAnuala = m;
    }
    
    public void afisare() {
        System.out.println(nume + " " + prenume);
    }

    public void setMedieAnuala(double m) {
        medieAnuala = m;
    }

    public void afisareMedieAnuala() {
        System.out.println(nume + " " + prenume + " " + medieAnuala);
    }

    public double getMedieAnuala() {
        return medieAnuala;
    }
}

class Profesor extends Persoana {
    private double salariu;

    public Profesor() {
        super();
        salariu = 0.0d;
    }

    public Profesor(String n) {
        super(n);
        salariu = 0.0d;
    }

    public Profesor(String n, String p) {
        super(n, p);
        salariu = 0.0d;
    }

    public Profesor(String n, String p, double s) {
        super(n, p);
        salariu = s;
    }

    public void afisare() {
        System.out.println(nume + " " + prenume);
    }

    public void setSalariu(double s) {
        salariu = s;
    }

    public void afisareSalariu() {
        System.out.println(nume + " " + prenume + " " + salariu + "$");
    }

    public double getSalariu() {
        return salariu;
    }
}

class Clasa {
    public Profesor profDiriginte;
    public Elev[] elevi;
    public char litera;
    public int nivel;

    Clasa() {
        profDiriginte = null;
        elevi = null;
        litera = 'A';
        nivel = 0;
    }

    Clasa(Profesor p, Elev[] e, char l, int n) {
        profDiriginte = new Profesor();
        profDiriginte.nume = p.nume;
        profDiriginte.prenume = p.prenume;
        profDiriginte.setSalariu(p.getSalariu());

        elevi = new Elev[e.length];
        for(int i = 0; i < e.length; i++) {
            elevi[i] = new Elev();
            elevi[i].nume = e[i].nume;
            elevi[i].prenume = e[i].prenume;
            elevi[i].setMedieAnuala(e[i].getMedieAnuala());
        }

        litera = l;
        nivel = n;
    }

    public void afisare() {
        System.out.println("==================");
        System.out.println("Clasa " + nivel + litera);

        System.out.print("Profesor diriginte: ");
        profDiriginte.afisare();

        System.out.print("Elevii clasei (" + nivel + litera + "):\n");
        for(int i = 0; i < elevi.length; i++) {
            elevi[i].afisare();
        }

        System.out.println("==================\n");
    }
}