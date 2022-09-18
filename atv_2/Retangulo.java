package atv_2;
import java.lang.Math;

public class Retangulo {
    private double largura;
    private double altura;

    public double area() {
        return this.largura * this.altura;
    }

    public double perimetro() {
        return this.altura*2 + this.largura*2;
    }

    public double diagonal() {
        double diagonal = Math.pow(Math.pow(this.altura, 2) + Math.pow(this.largura, 2), 0.5);
        return diagonal;
    }

    //Métodos especiais
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
}
