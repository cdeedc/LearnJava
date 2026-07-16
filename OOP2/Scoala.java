package OOP2;

public class Scoala {
    public Profesor[] profesori;
    public Clasa[] clase;
    public Profesor profDirector;
    public String adresa;
    public String nume;

    public Scoala(Profesor[] profs, Clasa[] cls, Profesor profDir, String adr, String n) {
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
        nume = n;
    }

    public void afisare() {
        System.out.println("==============================================");
        System.out.println(">>>> " + nume + " <<<<");
        System.out.println("==============================================");

        System.out.println("Cadre didactice:");
        for(Profesor prof : profesori)
            if(prof != null)
                prof.afisare();

        System.out.println("Clasele scolii:");
        for(Clasa clasa : clase)
            if(clasa != null)
                clasa.afisare();

        System.out.print("Profesor director: ");
        profDirector.afisare();

        System.out.println("Adresa: " + adresa);
        
        System.out.println("==============================================");
    }
}