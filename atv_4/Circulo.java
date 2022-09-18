package atv_4;
import java.lang.Math;

public class Circulo extends Formato{
    private double raio;

    @Override
    public double area() {
        return 3.14 * Math.pow(raio, 2);
    }

    //Métodos especiais
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
