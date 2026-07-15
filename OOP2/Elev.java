public class Elev extends Persoana {
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