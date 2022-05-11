package Herencia;

public abstract class Poligono {
    protected double area;
    protected double perimetro;
    protected double apotema;

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public abstract void calcularApotema();


    public double getArea() {return this.area;}

    public double getPerimetro() {return this.perimetro;}

    public double getApotema() {return this.apotema;}
}
