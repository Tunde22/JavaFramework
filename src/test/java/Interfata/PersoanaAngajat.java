package Interfata;

public class PersoanaAngajat extends Persoana implements AngajatInt{

    public PersoanaAngajat(String nume, String prenume, String varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul munceste.");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste Salariu.");
    }

    @Override
    public void isiIaConcediu() {
        System.out.println("Angajatul isi ia concediu.");
    }
}
