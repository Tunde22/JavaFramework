package ClasaAbstracta;

public abstract class Persoana {

    //recunoastem clasa abstracta dupa cuvantul abstract
    //poate sau nu sa contina metode abstracte
    //metodele pot sa fie void si return
    //putem avea constructor rezulta nu putem face un obiect
    //o clasa abstracta se mosteneste
    //clasa care mosteneste clasa abstracta trebuie sa implementeze metodele abstracte
    //ca sa facem ometoda abstracta adaugam cuvantul abstract
    //putem avea diferite access control-uri pentru diferite metode

    public abstract void mergeLaCursuri();

    public abstract void invata();

    public abstract void munceste();

    public abstract void primesteSalariu();

    public void esteMajora(){
        System.out.println("Persoana este majora.");
    }


}
