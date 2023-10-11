package Objects;

public class MasinaFabrica {

    //Constructor: are ca rol sa initializeze variabilele a unei clase
    // Intr-o clasa putem sa avem n constructori diferentiati prin nr-ul de parametrii/tip de parametri
    // Cons-ul are mereu acelasi lume cu clasa
    // Tot timpul avem un Cons intr-un clasa, exista cel default (fara parametru)
    //Cons-ul este public

    //Obiect = Instanta a unei clase
    //Ca sa creem un obiect avem nevoie de un Cons
    //Dintr-o clasa putem sa initializam n Obiecte
    //Ca sa initializam un obiect trebuie sa apelam constructorul clasei
    // Ca sa initializam un Obiect folosim un keyword "new"

    public String marca;
    public String model;
    public int an;
    public String motorizare;
    public String culoare;
    public int pret;

    public MasinaFabrica(String marca, String model, int an, String motorizare, String culoare) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.motorizare = motorizare;
        this.culoare = culoare;
    }

    public MasinaFabrica(String marca, String model, int an, String motorizare, String culoare, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.motorizare = motorizare;
        this.culoare = culoare;
        this.pret = pret;
    }

    public void prezentareMasina(){
        System.out.println("Marca: " + marca);
        System.out.println("Model: " + model);
        System.out.println("An: " + an);
        System.out.println("Motorizare: " + motorizare);
        System.out.println("Culoare: " + culoare);
        if(pret > 0){
            System.out.println("Pret: " + pret);
        }

    }


}
