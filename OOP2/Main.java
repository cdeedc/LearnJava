// Extended version
package OOP2;

public class Main {
	public static void main(String[] args) {
        Persoana p = new Persoana("Ion", "Ion");
        p.afisare();

	    /**Elev e = new Elev();
        e.afisare();

	    Elev e1 = new Elev("Ion");
	    e1.afisare();

        Elev e2 = new Elev("Popescu", "Alex", 9.95d);
        e2.afisareMedieAnuala();
        System.out.println(e2.getMedieAnuala());

        Profesor prof = new Profesor("Popescu");
        System.out.println(prof.nume);

        Profesor prof1 = new Profesor("Stefan", "Alex", 10000.0d);
        System.out.println(prof1.nume);
        System.out.println(prof1.prenume);
        prof1.afisareSalariu();
        */
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

    public void afisareMedieAnuala() {
        System.out.println(nume + " " + prenume + " " + medieAnuala);
    }

    public double getMedieAnuala() {
        return medieAnuala;
    }
}

class Profesor {
    public String nume;
    public String prenume;
    private double salariu;

    public Profesor() {
        nume = "";
        prenume = "";
        salariu = 0.0d;
    }

    public Profesor(String n) {
        nume = n;
        prenume = "";
        salariu = 0.0d;
    }

    public Profesor(String n, String p) {
        nume = n;
        prenume = p;
        salariu = 0.0d;
    }

    public Profesor(String n, String p, double s) {
        nume = n;
        prenume = p;
        salariu = s;
    }

    public void afisare() {
        System.out.println(nume + " " + prenume);
    }

    public void afisareSalariu() {
        System.out.println(nume + " " + prenume + " " + salariu + "$");
    }

    public double getSalariu() {
        return salariu;
    }
}
