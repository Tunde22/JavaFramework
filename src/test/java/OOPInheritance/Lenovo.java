package OOPInheritance;

public class Lenovo extends Laptop {
    private String port;

    public String getPort() {
        return port;
    }

    public Lenovo(String display, String form, String model, double price, String port) {
        super(display, form, model, price);
        this.port = port;
    }

    public void infoLenovo(){
        infoLaptop();
        System.out.println("Optiunile Exterioare pentru Lenovo sunt: " + port);
    }


}
