// Extended version
package OOP2;

public class Main {
	public static void main(String[] args) {
        Persoana p = new Persoana("Ion", "Ion");
        p.afisare();

	    Elev e = new Elev();
        e.afisare();

	    Elev e1 = new Elev("Ion");
	    e1.afisare();

        Elev e2 = new Elev("Popescu", "Alex", 9.95d);
        e2.afisareMedieAnuala();
        System.out.println(e2.getMedieAnuala() + "\n");

        Profesor prof = new Profesor("Popescu");
        System.out.println(prof.nume + "\n");

        Profesor prof1 = new Profesor("Stefan", "Alex", 10000.0d);
        System.out.println(prof1.nume);
        System.out.println(prof1.prenume);
        prof1.afisareSalariu();
        System.out.println();
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

    Clasa() {
        profDiriginte = null;
        elevi = null;
        litera = 'Z';
    }

    Clasa(Profesor p, Elev[] e, char l) {
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
    }

    public void afisare() {
        System.out.print("Profesor diriginte: ");
        profDiriginte.afisare();
        System.out.println("\n");

        for(int i = 0; i < elevi.length; i++) {
            elevi[i].afisare();
            System.out.println("\n");
        }
    }
}