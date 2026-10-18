package org.example;

public class EroeNonIdoneoException extends Exception {
    private String Eroe;
    private int Potere;

    public EroeNonIdoneoException(String Eroe, int Potere) {
        super("Eroe " + Eroe + " potere insufficiente (" + Potere + ")");
        this.Eroe = Eroe;
        this.Potere = Potere;
    }

    public String eroe() {
        return Eroe;
    }

    public int potere() {
        return Potere;
    }
}