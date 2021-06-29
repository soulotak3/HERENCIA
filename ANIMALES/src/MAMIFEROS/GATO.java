/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAMIFEROS;

import animales.ANIMALES;

/**
 *
 * @author wesho
 */
public class GATO extends ANIMALES {
    
    private String raza;
    private String sonido;
    private int kg;
    private String color;

    public GATO() {
    }

    public GATO(String raza, String sonido, int kg, String color) {
        this.raza = raza;
        this.sonido = sonido;
        this.kg = kg;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GATO{" + "raza=" + raza + ", sonido=" + sonido + ", kg=" + kg + ", color=" + color + '}';
    }
    
    
}
