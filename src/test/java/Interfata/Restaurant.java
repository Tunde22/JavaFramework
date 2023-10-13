package Interfata;

import java.util.List;

public class Restaurant {

    private String nume;
    private int oraDeschidere;
    private int oraInchidere;
    private List<String> menu;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getOraDeschidere() {
        return oraDeschidere;
    }

    public void setOraDeschidere(int oraDeschidere) {
        this.oraDeschidere = oraDeschidere;
    }

    public int getOraInchidere() {
        return oraInchidere;
    }

    public void setOraInchidere(int oraInchidere) {
        this.oraInchidere = oraInchidere;
    }


}
