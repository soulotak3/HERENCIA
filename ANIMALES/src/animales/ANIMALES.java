/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;
import MAMIFEROS.GATO;
import MAMIFEROS.PERRO;


/**
 *
 * @author wesho
 */
public class ANIMALES {
    private int numerodepatas;
    private String animal;
    private String pelo;

    public ANIMALES() {
    }

    public ANIMALES(int numerodepatas, String animal, String pelo) {
        this.numerodepatas = numerodepatas;
        this.animal = animal;
        this.pelo = pelo;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        ANIMALES a1= new ANIMALES (4, "de casa", "blanco");
        System.out.println(a1);
        GATO b1= new GATO  ("europeo de pelo corto", "meow", 5, "gris franjas negras");
        System.err.println(b1);
        PERRO c1=new PERRO ("schnauzer", 9, "gris con blanco", "bark");
        System.out.println(c1);
        
        
    }

    public int getNumerodepatas() {
        return numerodepatas;
    }

    public void setNumerodepatas(int numerodepatas) {
        this.numerodepatas = numerodepatas;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    @Override
    public String toString() {
        return "ANIMALES{" + "numerodepatas=" + numerodepatas + ", animal=" + animal + ", pelo=" + pelo + '}';
    }
    
}
