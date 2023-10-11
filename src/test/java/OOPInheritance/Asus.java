package OOPInheritance;

import java.util.ArrayList;
import java.util.List;

public class Asus extends Laptop{//Mostenire, Numai o clasa poate fi mostenit
    //Child must have parent constructor
    private List<String> externalOptions;

    public List<String> getExternalOptions() {
        return externalOptions;
    }

    public void setExternalOptions(List<String> externalOptions) {
        this.externalOptions = externalOptions;
    }

    public Asus(String display, String form, String model, double price, List<String> externalOptions) {
        super(display, form, model, price);
        this.externalOptions = externalOptions;
    }

    public void infoAsus(){
        infoLaptop();
        System.out.println("Optiunile Exterioare pentru ASUS sunt: ");
        for(int i = 0; i < externalOptions.size(); i++ ){
            System.out.println(externalOptions.get(i));
        }
    }






}
