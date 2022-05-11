package Herencia;

public class Heptagono extends Poligono{
    private double lado;

    public Heptagono (double lado){
        if (lado < 0) {
            this.lado = 0;
        } else {
            this.lado = lado;
        }
        this.calcularApotema();
        this.calcularPerimetro();
        this.calcularArea();

    }

    @Override
    public void calcularArea() {
        this.area = this.perimetro * this.apotema /2;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.lado * 7;
    }

    @Override
    public void calcularApotema() {
        this.apotema = this.lado / 0.9631;
    }
}
