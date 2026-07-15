public class Scoala {
    public Profesor[] profesori;
    public Clasa[] clase;
    public Profesor profDirector;
    public String adresa;

    public Scoala(Profesor[] profs, Clasa[] cls, Profesor profDir, String adr) {
        profesori = new Profesor[profs.length];
        for(int i = 0; i < profs.length; i++) {
            profesori[i] = new Profesor(profs[i].nume, profs[i].prenume);
            profesori[i].setSalariu(profs[i].getSalariu());
        }

        clase = new Clasa[cls.length];
        for(int i = 0; i < cls.length; i++)
            clase[i] = cls[i];

        profDirector = new Profesor(profDir.nume, profDir.prenume);
        profDirector.setSalariu(profDir.getSalariu());

        adresa = adr;
    }

    public void afisare() {
        
    }
}