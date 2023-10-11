package Polymorfism;

public class Caine extends Animal{


    public Caine(String nume, String rasa, Integer varsta) {
        super(nume, rasa, varsta);
    }

    public void faceSunet(){
        System.out.println("Cainele latra");
    }

}
