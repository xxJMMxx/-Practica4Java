package Herencia;

public class Hexagono extends Poligono {
    private double cateto;

    public Hexagono (double cateto){
        if (cateto < 0) {
            this.cateto = 0;
        } else {
            this.cateto = cateto;
        }
        this.calcularApotema();
        this.calcularPerimetro();
        this.calcularArea();
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.cateto * 6;
    }

    @Override
    public void calcularApotema() {
        this.apotema = (Math.sqrt((this.cateto * this.cateto) - ((this.cateto / 2) * (this.cateto / 2))));
    }

    @Override
    public void calcularArea() {
        this.area = this.perimetro * this.apotema /2;
    }
}
