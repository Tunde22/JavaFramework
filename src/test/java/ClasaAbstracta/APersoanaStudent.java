package ClasaAbstracta;

public class APersoanaStudent extends Persoana{
    @Override
    public void mergeLaCursuri() {
        System.out.println("merge la cursuri");
    }

    @Override
    public void invata() {
        System.out.println("invata.");
        esteMajora();

    }

    @Override
    public void munceste() {

    }

    @Override
    public void primesteSalariu() {

    }
}
