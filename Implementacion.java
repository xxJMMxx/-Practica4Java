import Herencia.*;

public class Implementacion {
    public static void main (String[] args){

        // clase hija 1
        Pentagono pt = new Pentagono(5);
        System.out.println(pt.getPerimetro());
        System.out.println(pt.getApotema());
        System.out.println(pt.getArea());
        System.out.println(" ");

        // clase hija 2
        Hexagono hex = new Hexagono(6);
        System.out.println(hex.getPerimetro());
        System.out.println(hex.getApotema());
        System.out.println(hex.getArea());
        System.out.println(" ");

        // clase hija 3
        Heptagono hpt = new Heptagono(5);
        System.out.println(hpt.getPerimetro());
        System.out.println(hpt.getApotema());
        System.out.println(hpt.getArea());

    }
}
