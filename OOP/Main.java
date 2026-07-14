package LearnJava.OOP;

public class Main {
	public static void main(String[] args) {
	    Elev e = new Elev();
        e.afisare();

	    Elev e1 = new Elev("Ion");
	    e1.afisare();

        Elev e2 = new Elev("Popescu", "Alex", 9.95d);
        e2.afisareMedieAnuala();
	}
}

class Elev {
    public String nume;
    public String prenume;
    public double medieAnuala;
    
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

