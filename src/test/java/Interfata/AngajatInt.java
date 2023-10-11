package Interfata;

public interface AngajatInt {

    //Recunoastem o clasa dupa cuvantul interface.
    // o interfata poate avea doar metode abstracte.
    // metodele pot sa fie void sau return
    // nu avem constructor intr=-o interfata care in rezulta ca nu putem face un obiect
    // clasa care implementeaza interfata rezulta trebuie sa implementeze toate metodele din ea
    // o interfata se implementeaza, nu se mosteneste
    // in Java o clasa poate implementa n interfete
    // o clasa abstracta poate implementa o interfata
    // metodele din interfata sunt publice
    // o interfata poate mosteni o alta interfata

    void munceste();
    void primesteSalariu();
    void isiIaConcediu();

}
