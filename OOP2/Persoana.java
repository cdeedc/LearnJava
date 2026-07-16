package OOP2;

public class Persoana {
    public String nume;
    public String prenume;

    public Persoana() {
        nume = "";
        prenume = "";
    }

    public Persoana(String n) {
        nume = n;
        prenume = "";
    }

    public Persoana(String n, String p) {
        nume = n;
        prenume = p;
    }

    public void afisare() {
        System.out.println(nume + " " + prenume);
    }
}
