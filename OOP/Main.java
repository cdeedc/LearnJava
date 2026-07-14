package LearnJava.OOP;

public class Main {
	public static void main(String[] args) {
	    Elev e = new Elev();
        e.afisare();

	    Elev e1 = new Elev("Ion");
	    e1.afisare();

        Elev e2 = new Elev("Popescu", "Alex", 9.95d);
        e2.afisareMedieAnuala();
        System.out.println(e2.getMedieAnuala());

        Profesor prof = new Profesor("Popescu");
        System.out.println(prof.nume);
	}
}

class Elev {
    public String nume;
    public String prenume;
    private double medieAnuala;
    
    public Elev() {
        nume = "";
        prenume = "";
        medieAnuala = 0.0d;
    }
    
    public Elev(String n) {
        nume = n;
    }

    public Elev(String n, String p) {
        nume = n;
        prenume = p;
    }

    public Elev(String n, String p, double m) {
        nume = n;
        prenume = p;
        medieAnuala = m;
    }
    
    public void afisare() {
        System.out.println(nume);
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
        System.out.println(nume + " " + prenume + " " + salariu + "$");
    }
}