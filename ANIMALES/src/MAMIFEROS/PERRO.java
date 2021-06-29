/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAMIFEROS;

/**
 *
 * @author wesho
 */
public class PERRO {
    
    private String raza;
    private int kg;
    private String color;
    private String sonido;

    public PERRO() {
    }

    public PERRO(String raza, int kg, String color, String sonido) {
        this.raza = raza;
        this.kg = kg;
        this.color = color;
        this.sonido = sonido;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return "PERRO{" + "raza=" + raza + ", kg=" + kg + ", color=" + color + ", sonido=" + sonido + '}';
    }
    
    
    
}
