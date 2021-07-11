import javax.swing.event.MenuDragMouseListener;

public class Persoana {
    private String nume;
    private String prenume;
    private int varsta;
    private String gen;
    private Adresa adresa;
    private String CNP;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public Persoana (String nume, String prenume, String CNP){
        this.nume= nume;
        this.prenume= prenume;
        this.CNP= CNP;
    }

    public Persoana(String nume, String prenume, int varsta, String gen) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Nume " + nume  + ", Prenume " + prenume  + ", Varsta " + varsta + ", Gen " + gen  + ", Adresa " + adresa + ", CNP " + CNP ;
    }
}