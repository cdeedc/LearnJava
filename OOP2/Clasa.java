enum Nivel { IX, X, XI, XII }
enum Litera { A, B, C, D }

public class Clasa {
    public Profesor profDiriginte;
    public Elev[] elevi;
    private Nivel nivel;
    private Litera litera;

    public Clasa() {
        profDiriginte = null;
        elevi = null;
        litera = Litera.A;
        nivel = Nivel.IX;
    }

    public Clasa(Profesor p, Elev[] e, Nivel n, Litera l) {
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
        
        nivel = n;
        litera = l;
    }

    public Clasa(Nivel n, Litera l, int nrElevi) {
        nivel = n;
        litera = l;
        elevi = new Elev[nrElevi];
    }

    public void adaugareElev(Elev e, int poz) {
        elevi[poz] = e;
    }

    public void setNivel(Nivel n) {
        nivel = n;
    }

    public void setLitera(Litera l) {
        litera = l;
    }

    public void afisare() {
        System.out.println("==================");
        System.out.println(">>> Clasa a " + nivel + "-a " + litera + " <<<");

        System.out.print("Profesor diriginte: ");
        profDiriginte.afisare();

        System.out.print("Elevii clasei (" + nivel + litera + "):\n");
        for(int i = 0; i < elevi.length; i++) {
            elevi[i].afisare();
        }

        System.out.println("==================\n");
    }
}