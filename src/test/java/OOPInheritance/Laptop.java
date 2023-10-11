package OOPInheritance;

public class Laptop {

    //Incapsularea datelor = conceptul in care tinem departe de exterior anumite variabile si valorile acestora
    // private= e un access control care imiteaza accesul doar pentru aceasta clasa.
    // ca sa accesam/ modificam variabile/valoriile ne folosim conceptul get/set.


    private String display;
    private String form;
    private String model;
    private double price;



    public Laptop(String display, String form, String model, double price) {
        this.display = display;
        this.form = form;
        this.model = model;
        this.price = price;
    }

    public void infoLaptop(){
        System.out.println("The Laptop's Display is: " + display);
        System.out.println("The Laptop's Form is: " + form);
        System.out.println("The Laptop's model is: " + model);
        System.out.println("The Laptop's Price is: " + price);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "display='" + display + '\'' +
                ", form='" + form + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDisplay() {
        return display;
    }

    public String getForm() {
        return form;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
