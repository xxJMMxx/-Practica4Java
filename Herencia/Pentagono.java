package Herencia;

public class Pentagono extends Poligono{
    private double lado;

    public Pentagono (double lado){
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
        this.perimetro = this.lado * 5;
    }

    @Override
    public void calcularApotema() {
        this.apotema = this.lado / 1.4539;
    }
}
