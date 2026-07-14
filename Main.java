package LearnJava;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
	    Elev e = new Elev();
	    Elev e2 = new Elev("Ion");
	    e2.afisare();
	}
}

class Elev {
    public String nume;
    public String prenume;
    public double medieAnuala;
    
    public Elev() {
        
    }
    
    public Elev(String n) {
        nume = n;
    }

    public Elev(String n, String p) {
        nume = n;
        prenume = p;
    }
    
    public void afisare() {
        System.out.println(nume);
    }

    public void afisareMedieAnuala() {
        System.out.println();
    }

    public double getMedieAnuala() {
        return medieAnuala;
    }
}
