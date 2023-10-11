package Polymorfism;

public class Pisica extends Animal{

    public Pisica(String nume, String rasa, Integer varsta) {
        super(nume, rasa, varsta);
    }

    public void mananca(){
        System.out.println("Pisica mananca catfood");
    }

    public void mananca(String mancare){
        System.out.println("Pisica mananca catfood si " + mancare);
    }

    public void mananca(Integer ora){
        System.out.println("Pisica mananca catfood la ora " + ora);
    }

    public void faceSunet(){
        System.out.println("Miauna pisica");
    }
}
