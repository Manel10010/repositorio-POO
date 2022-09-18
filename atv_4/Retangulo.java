package atv_4;

public class Retangulo extends Formato{
    private double largura;
    private double altura;

    @Override
    public double area() {
        return largura*altura;
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
