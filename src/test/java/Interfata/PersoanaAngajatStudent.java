package Interfata;

public class PersoanaAngajatStudent extends Persoana implements AngajatInt, StudentInt{
    public PersoanaAngajatStudent(String nume, String prenume, String varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul Student munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul Student primeste Salariu.");

    }

    @Override
    public void isiIaConcediu() {
        System.out.println("Angajatul Student isi ia concediu.");

    }

    @Override
    public void invata() {
        System.out.println("Angajatul Student invata");

    }

    @Override
    public void primesteBursa() {
        System.out.println("Angajatul Student primeste bursa.");

    }

    @Override
    public void daExamene() {
        System.out.println("Angajatul Student da examene");

    }
}
