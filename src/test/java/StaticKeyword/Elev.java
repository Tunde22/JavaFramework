package StaticKeyword;

public class Elev {

    //static: are ca scop de a transmite o variabila/metoda dintr-o clasa in alta
    // in momentul cand avem mai multe obiecte de acelas tip putem considera faptul ca acestea au o proprietate comuna
    //Valoarea proprietati se pastreaza pentru toate obiectele

    private String nume;
    private String prenume;
    private Integer varsta;
    private static String scoala = "Mihai Eminescu";
    private static Integer nrElev = 0;

    public Elev(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        nrElev++;
    }

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

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }



    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta + '\'' +
                ", scoala=" + scoala + '\'' +
                ", nrElev=" + nrElev +
                '}';
    }
}
