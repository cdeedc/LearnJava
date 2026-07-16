package OOP2;

public class Profesor extends Persoana {
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